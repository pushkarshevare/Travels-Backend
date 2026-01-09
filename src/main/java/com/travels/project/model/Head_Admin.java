package com.travels.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Head_Admin {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	
	private String username;
	
	private String a_password;


	public Head_Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Head_Admin(int a_id, String username, String a_password) {
		super();
		this.a_id = a_id;
		this.username = username;
		this.a_password = a_password;
	}




	public int getA_id() {
		return a_id;
	}


	public void setA_id(int a_id) {
		this.a_id = a_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getA_password() {
		return a_password;
	}


	public void setA_password(String a_password) {
		this.a_password = a_password;
	}


	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", username=" + username + ", a_password=" + a_password + "]";
	}
	
	
	
	
}
