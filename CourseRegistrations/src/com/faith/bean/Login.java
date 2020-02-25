package com.faith.bean;


public class Login {

	// instance variable
	private Integer loginId;
	private String username;
	private String password;
	private Integer roleId;
	private String fullName;
	private String isActive;

	// default constructor
	public Login() {

	}

	
	public Login(String username, String password, Integer roleId,
			String fullName, String isActive) {

		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.fullName = fullName;
		this.isActive = isActive;
	}

	public Login(Integer loginId, String username, String password,
			Integer roleId, String fullName, String isActive) {

		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.fullName = fullName;
		this.isActive = isActive;
	}

	
	public Login(Integer loginId, String username, String password,
			Integer roleId, String fullName) {
		
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.fullName = fullName;
	}

	
	public Login(String username, String password, Integer roleId,
			String fullName) {

		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.fullName = fullName;
	}

	// getters and setters
	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	// toString
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username
				+ ", password=" + password + ", roleId=" + roleId
				+ ", fullName=" + fullName + ", isActive=" + isActive + "]";
	}

}
