package com.admin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Admin {
	@Id
	private String username;
	private String password;
	private String adminName;
	
	public Admin() {
	
	}

	public Admin(String username, String password, String adminName) {
		super();
		this.username = username;
		this.password = password;
		this.adminName = adminName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", adminName=" + adminName + "]";
	}

	
	
	

}
