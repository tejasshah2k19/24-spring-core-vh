package com.dao;

public class UserDao {

	
	private String userName; //null
	
	public void addUser() {
		System.out.println("UserDao::addUser()");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
