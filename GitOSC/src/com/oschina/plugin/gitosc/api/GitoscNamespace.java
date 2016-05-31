package com.oschina.plugin.gitosc.api;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bili on 2016/5/31.
 */
public class GitoscNamespace {
	/**
	 * address : 192.168.1.12
	 * avatar : null
	 * created_at : 2015-03-20T18:29:05+08:00
	 * description :
	 * email : null
	 * id : 342584
	 * location : null
	 * name : example
	 * owner_id : 349252
	 * path : example
	 * public : null
	 * updated_at : 2016-01-07T00:49:59+08:00
	 * url : null
	 */

	private String address;
	private String avatar;
	private Date createdAt;
	private String description;
	private String email;
	private long id;
	private String location;
	private String name;
	private long ownerId;
	private String path;
	@SerializedName("public")
	private boolean isPublic;
	private String updatedAt;
	private String url;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean aPublic) {
		isPublic = aPublic;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
