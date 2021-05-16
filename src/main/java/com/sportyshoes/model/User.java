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
	
	private String firstname;
	
	private String lastname;
	
	private String username;
	
	private String email;
	
	private String role;
	
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String firstname, String lastname, String username, String email, String role,
			String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
	}

	public Long getUserid() {
		return userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
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
		return "User [userid=" + userid + ", firstName=" + firstname + ", lastName=" + lastname + ", username="
				+ username + ", email=" + email + ", role=" + role + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}	
	

