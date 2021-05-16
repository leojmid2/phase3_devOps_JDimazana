package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.model.User;

public interface UserRepositoryI extends JpaRepository<User,Long>{

	List<User> findByUsernameAndPassword(String name, String password);

	List<User> findByFirstnameAndLastname(String firstname, String lastname);

	List<User> findByRole(String role);

	Optional<User> findByEmail(String email);

	
}
