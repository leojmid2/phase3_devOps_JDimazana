package com.sportyshoes;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sportyshoes.model.User;
import com.sportyshoes.repository.UserRepository;

@SpringBootApplication
public class SportyShoesApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Run method");
		//firstName, lastName, username, email, String role,password
		//userRepository.save(new User("Jack","Sparrow","js","js@yahoo.com","user","pw"));
		User user = userRepository.findById(13L);
		logger.info("user : " + user );
	
		List<User> users= userRepository.findByUserPassword("jd", "password");
		if (!users.isEmpty()) {
			User u = (User) users.get(0);
			logger.info("user found! " + u  );
		}
		else
			logger.info("user not found" );

	}

}
