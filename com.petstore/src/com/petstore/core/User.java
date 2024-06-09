package com.petstore.core;

import java.util.Objects;

import com.petstore.enums.UserEnum;

public class User {
	
	private String userid;
	private String password;
	private UserEnum uenum;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String password, UserEnum uenum) {
		super();
		this.userid = userid;
		this.password = password;
		this.uenum = uenum;
	}
	public User(String userid2, String pass) {
		this.userid=userid2;
		this.password=pass;
	}
	public String getuserid() {
		return userid;
	}
	public void setuserid(String userid) {
		this.userid = userid;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public UserEnum getUenum() {
		return uenum;
	}
	public void setUenum(UserEnum uenum) {
		this.uenum = uenum;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User u1 = (User)obj;
			return this.getuserid().equals(u1.getuserid());
		}
		return false;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + "]";
	}
	
}
