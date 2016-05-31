package com.oschina.plugin.gitosc;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by Bili on 2016/5/31.
 */
public class SayHelloAction extends AnAction {

	@Override
	public void actionPerformed(AnActionEvent e) {
		Project project = e.getProject();
		String content = Messages.showInputDialog(project,"What is your name?","Input your name",Messages.getQuestionIcon());
		Messages.showMessageDialog(project,String.format("Hello, %s!\nI am glad to see you.",content),"Information",Messages.getInformationIcon());
	}
}
