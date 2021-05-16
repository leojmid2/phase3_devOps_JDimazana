package com.sportyshoes.repository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sportyshoes.SportyShoesApplication;
import com.sportyshoes.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SportyShoesApplication.class)
class UserRepositoryTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepositoryI repository;
	
	@Test
	public void findById_basic() {
		Optional<User> userOptional = repository.findById(1L);
		assertTrue(userOptional.isPresent());
		
	}
	
	@Test
	public void findByIdPresent() {
		Optional<User> userOptional = repository.findById(5L);
		assertFalse(userOptional.isPresent());
		
	}

}
