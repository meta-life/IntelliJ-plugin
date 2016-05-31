package com.oschina.plugin.gitosc.util;

import java.io.IOException;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.util.ThrowableConvertor;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscUtil {
	public static <T> T computeValueInModalIO(@NotNull Project project,
											  @NotNull String caption,
											  @NotNull final ThrowableConvertor<ProgressIndicator, T, IOException> task) throws IOException {
		return ProgressManager.getInstance().run(new Task.WithResult<T, IOException>(project, caption, true) {
			@Override
			protected T compute(@NotNull ProgressIndicator indicator) throws IOException {
				return task.convert(indicator);
			}
		});
	}
}
