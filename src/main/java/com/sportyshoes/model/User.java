package com.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
	private String firstName;
	
	private String lastName;
	
	private String username;
	
	private String email;
	
	private String role;
	
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String username, String email, String role,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
	}

	public Long getUserid() {
		return userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", email=" + email + ", role=" + role + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}	
	
