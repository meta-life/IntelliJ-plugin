package com.oschina.plugin.gitosc.api;

import java.util.Date;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscRepo {


	/**
	 * id : 185064
	 * name : CurePHP
	 * description :
	 * default_branch : master
	 * owner : {"id":61340,"username":"xsilen","email":"xsilen@163.com","name":"xsilen","state":"active","created_at":"2013-12-25T18:03:20.000+08:00","portrait":"uploads/40/61340_xsilen.png?1436280956","new_portrait":"http://git.oschina.net/uploads/40/61340_xsilen.png?1436280956"}
	 * public : false
	 * path : CurePHP
	 * path_with_namespace : xsilen/CurePHP
	 * issues_enabled : true
	 * pull_requests_enabled : true
	 * wiki_enabled : true
	 * created_at : 2014-08-10T22:46:22.000+08:00
	 * namespace : {"id":57303,"name":"xsilen","path":"xsilen","owner_id":61340,"created_at":"2013-12-25T18:03:20.000+08:00","updated_at":"2013-12-25T18:03:20.000+08:00","description":""}
	 * last_push_at : 2014-11-26T16:32:37.000+08:00
	 * parent_id : null
	 * fork? : false
	 * forks_count : 2
	 * stars_count : 5
	 * watches_count : 3
	 * language : PHP
	 * paas : xsilen.oschina.mopaas.com
	 * stared : null
	 * watched : null
	 * relation : null
	 * recomm : 0
	 * parent_path_with_namespace : null
	 */

	private long id;
	private String name;
	private String description;
	private String defaultBranch;
	/**
	 * id : 61340
	 * username : xsilen
	 * email : xsilen@163.com
	 * name : xsilen
	 * state : active
	 * created_at : 2013-12-25T18:03:20.000+08:00
	 * portrait : uploads/40/61340_xsilen.png?1436280956
	 * new_portrait : http://git.oschina.net/uploads/40/61340_xsilen.png?1436280956
	 */

	private GitoscUser owner;
	@com.google.gson.annotations.SerializedName("public")
	private boolean isPublic;
	private String path;
	private GitoscNamespace pathWithNamespace;
	private boolean issuesEnabled;
	private boolean pullRequestsEnabled;
	private boolean wikiEnabled;
	private Date createdAt;
	/**
	 * id : 57303
	 * name : xsilen
	 * path : xsilen
	 * owner_id : 61340
	 * created_at : 2013-12-25T18:03:20.000+08:00
	 * updated_at : 2013-12-25T18:03:20.000+08:00
	 * description :
	 */

	private GitoscNamespace namespace;
	private String lastPushAt;
	private long parentId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultBranch() {
		return defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	public GitoscUser getOwner() {
		return owner;
	}

	public void setOwner(GitoscUser owner) {
		this.owner = owner;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean aPublic) {
		isPublic = aPublic;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public GitoscNamespace getPathWithNamespace() {
		return pathWithNamespace;
	}

	public void setPathWithNamespace(GitoscNamespace pathWithNamespace) {
		this.pathWithNamespace = pathWithNamespace;
	}

	public boolean issuesEnabled() {
		return issuesEnabled;
	}

	public void setIssuesEnabled(boolean issuesEnabled) {
		this.issuesEnabled = issuesEnabled;
	}

	public boolean isPullRequestsEnabled() {
		return pullRequestsEnabled;
	}

	public void setPullRequestsEnabled(boolean pullRequestsEnabled) {
		this.pullRequestsEnabled = pullRequestsEnabled;
	}

	public boolean isWikiEnabled() {
		return wikiEnabled;
	}

	public void setWikiEnabled(boolean wikiEnabled) {
		this.wikiEnabled = wikiEnabled;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public GitoscNamespace getNamespace() {
		return namespace;
	}

	public void setNamespace(GitoscNamespace namespace) {
		this.namespace = namespace;
	}

	public String getLastPushAt() {
		return lastPushAt;
	}

	public void setLastPushAt(String lastPushAt) {
		this.lastPushAt = lastPushAt;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
}
