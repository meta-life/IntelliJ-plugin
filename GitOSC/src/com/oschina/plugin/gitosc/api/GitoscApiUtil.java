package com.oschina.plugin.gitosc.api;

import java.util.List;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscApiUtil {
	public static final String DEFAULT_GITOSC_URL="https://git.oschina.net/api/v3";

	private static final String PAGE = "page=1";
	private static final Header  USER_AGENT = new BasicHeader("User-Agent","CC/1.0-JB.Intellij IDEA");

	/**
	 * 登录
	 * @param email
	 * @param password
	 * @return
	 */
	public static GitoscUser login(String email,String password) {
		//TODO post /session
		return null;
	}

	public static List<GitoscRepo> repoList(String privateToken,int page) {
		//TODO get /projects

		return null;
	}
	public static boolean createRepo(String privateToken,String projectIdOrNamespace) {

		return false;
	}
}
