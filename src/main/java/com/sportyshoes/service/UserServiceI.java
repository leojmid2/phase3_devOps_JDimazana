package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import com.sportyshoes.model.User;

public interface UserServiceI {
	
	public Optional<User> findById(Long id);
	
	public List<User> findByUsernameAndPassword(String username, String password);
	
	public void save(User user);
	
	public void delete(User user);
	
	public List<User> findAllSignedUser(String role);
	
	public User findByFirstnameAndLastname(String firstname, String lastname);

	public Optional<User> findByEmail(String email);

}
