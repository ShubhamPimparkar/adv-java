package com.entity;

import java.util.Objects;

public class Cricketer {

	private String name;
	private int age;
	private String email;
	private String phone;
	private int rating;
	
	public Cricketer() {
		
	}
	public Cricketer(String name) {
		this.name=name;
		
	}
	
	public Cricketer(String name, int age, String email, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cricketer) {
			System.out.println("Inside equals");
			Cricketer c = (Cricketer)obj;
			return this.name.equals(c.getName());
		}
		return false;		
	}
	
	
	
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", rating="
				+ rating + "]";
	}


	
	
	
}
