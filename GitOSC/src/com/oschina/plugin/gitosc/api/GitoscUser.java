package com.oschina.plugin.gitosc.api;

import java.util.Date;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscUser {
	/**
	 * id : 6168
	 * username : example
	 * name : example
	 * bio : someone
	 * weibo : don't knwon
	 * blog : https://example.com/
	 * theme_id : 1
	 * state : active
	 * created_at : 2013-06-05T22:40:38+08:00
	 * portrait : uploads/123455.jpg
	 * email : example@example.com
	 * new_portrait : http://git.oschina.net/uploads/xx.jpg
	 * follow : {"followers":34,"starred":5,"following":2,"watched":5}
	 * private_token : private_tokenXX
	 * is_admin : true
	 * can_create_group : true
	 * can_create_project : true
	 * can_create_team : true
	 */

	private long id;
	private String username;
	private String name;
	private String bio;
	private String weibo;
	private String blog;
	private int themeId;
	private String state;
	private Date createdAt;
	private String portrait;
	private String email;
	private String newPortrait;
	/**
	 * followers : 34
	 * starred : 5
	 * following : 2
	 * watched : 5
	 */

	private FollowBean follow;
	private String private_token;
	private boolean isAdmin;
	private boolean canCreateGroup;
	private boolean canCreateProject;
	private boolean canCreatTeam;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNewPortrait() {
		return newPortrait;
	}

	public void setNewPortrait(String newPortrait) {
		this.newPortrait = newPortrait;
	}

	public FollowBean getFollow() {
		return follow;
	}

	public void setFollow(FollowBean follow) {
		this.follow = follow;
	}

	public String getPrivate_token() {
		return private_token;
	}

	public void setPrivate_token(String private_token) {
		this.private_token = private_token;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean admin) {
		isAdmin = admin;
	}

	public boolean isCanCreateGroup() {
		return canCreateGroup;
	}

	public void setCanCreateGroup(boolean canCreateGroup) {
		this.canCreateGroup = canCreateGroup;
	}

	public boolean isCanCreateProject() {
		return canCreateProject;
	}

	public void setCanCreateProject(boolean canCreateProject) {
		this.canCreateProject = canCreateProject;
	}

	public boolean isCanCreatTeam() {
		return canCreatTeam;
	}

	public void setCanCreatTeam(boolean canCreatTeam) {
		this.canCreatTeam = canCreatTeam;
	}

	public static class FollowBean {
		private int followers;
		private int starred;
		private int following;
		private int watched;

		public int getFollowers() {
			return followers;
		}

		public void setFollowers(int followers) {
			this.followers = followers;
		}

		public int getStarred() {
			return starred;
		}

		public void setStarred(int starred) {
			this.starred = starred;
		}

		public int getFollowing() {
			return following;
		}

		public void setFollowing(int following) {
			this.following = following;
		}

		public int getWatched() {
			return watched;
		}

		public void setWatched(int watched) {
			this.watched = watched;
		}
	}
}
