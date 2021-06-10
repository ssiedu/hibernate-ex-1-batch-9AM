package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	private String email;
	private String name;
	private String address;
	@ManyToMany
	private List<User> followers=new ArrayList<User>();
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<User> getFollowers() {
		return followers;
	}
	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}
	public User(String email, String name, String address) {
		super();
		this.email = email;
		this.name = name;
		this.address = address;
	}
	public User(String email) {
		super();
		this.email = email;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
