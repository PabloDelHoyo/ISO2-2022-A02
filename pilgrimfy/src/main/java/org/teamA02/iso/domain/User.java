package org.teamA02.iso.domain;

public class User {
	private String userName;
	private String emailAddress;
	private String password;
	private String userRole;
	public User(String userName, String emailAddress, String password, String userRole) {
		super();
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.userRole = userRole;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", userRole=" + userRole + "]";
	}
	
}
