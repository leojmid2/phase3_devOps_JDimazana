package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.User;
import com.sportyshoes.repository.UserRepositoryI;

@Service
@Transactional
public class UserServiceImp implements UserServiceI {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepositoryI userRepository;
	
	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findByUsernameAndPassword(String username, String password) {
		logger.info("findByUsernameAndPassword");
		return userRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	//for new and update
	public void save(User user) {
		userRepository.save(user);
	}


	@Override
	public void delete(User user) {
		userRepository.delete(user);

	}

	@Override
	public List<User> findAllSignedUser(String role) {
		logger.info("return all signedUser");
		return userRepository.findByRole(role);
	}

	@Override
	public User findByFirstnameAndLastname(String firstname, String lastname) {
		List<User> users = userRepository.findByFirstnameAndLastname(firstname, lastname);
		if (!users.isEmpty()) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public Optional<User> findByEmail(String email) {
		Optional<User> user = userRepository.findByEmail(email);
		return user;
	}

}
