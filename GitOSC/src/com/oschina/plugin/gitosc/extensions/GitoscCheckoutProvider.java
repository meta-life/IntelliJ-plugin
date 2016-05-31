package com.oschina.plugin.gitosc.extensions;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.plugins.github.api.GithubApiUtil;
import org.jetbrains.plugins.github.api.GithubRepo;
import org.jetbrains.plugins.github.util.GithubAuthDataHolder;
import org.jetbrains.plugins.github.util.GithubNotifications;
import org.jetbrains.plugins.github.util.GithubUrlUtil;
import org.jetbrains.plugins.github.util.GithubUtil;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.CheckoutProvider;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.oschina.plugin.gitosc.util.GitoscUtil;

import git4idea.actions.BasicAction;
import git4idea.checkout.GitCheckoutProvider;
import git4idea.checkout.GitCloneDialog;
import git4idea.commands.Git;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscCheckoutProvider implements CheckoutProvider {
	/**
	 * @param project  current project or default project if no project is open.
	 * @param listener
	 */
	@Override
	public void doCheckout(@NotNull Project project, @Nullable Listener listener) {
		if (!GithubUtil.testGitExecutable(project)) {
			return;
		}
		BasicAction.saveAll();
		//获取仓库列表
		List<GithubRepo> availableRepos;
		try {
			availableRepos = GitoscUtil.computeValueInModalIO(project, "Access to Git@OSC", indicator ->
					GithubUtil.runTask(project, GithubAuthDataHolder.createFromSettings(), indicator, GithubApiUtil::getAvailableRepos));
		}
		catch (IOException e) {
			GithubNotifications.showError(project, "Couldn't get the list of Git@OSC repositories", e);
			return;
		}
		Collections.sort(availableRepos, (r1, r2) -> {
			final int comparedOwners = r1.getUserName().compareTo(r2.getUserName());
			return comparedOwners != 0 ? comparedOwners : r1.getName().compareTo(r2.getName());
		});

		final GitCloneDialog dialog = new GitCloneDialog(project);
		// Add predefined repositories to history
		dialog.prependToHistory("-----------------------------------------------");
		for (int i = availableRepos.size() - 1; i >= 0; i--) {
			dialog.prependToHistory(GithubUrlUtil.getCloneUrl(availableRepos.get(i).getFullPath()));
		}
		if (!dialog.showAndGet()) {
			return;
		}
		dialog.rememberSettings();
		final VirtualFile destinationParent = LocalFileSystem.getInstance().findFileByIoFile(new File(dialog.getParentDirectory()));
		if (destinationParent == null) {
			return;
		}
		final String sourceRepositoryURL = dialog.getSourceRepositoryURL();
		final String directoryName = dialog.getDirectoryName();
		final String parentDirectory = dialog.getParentDirectory();

		Git git = ServiceManager.getService(Git.class);
		GitCheckoutProvider.clone(project, git, listener, destinationParent, sourceRepositoryURL, directoryName, parentDirectory);
	}

	@Override
	public String getVcsName() {
		return "Git@OSC";
	}
}
