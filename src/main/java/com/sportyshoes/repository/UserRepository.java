package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sportyshoes.model.User;

@Repository
@Transactional
public class UserRepository {
	
	@Autowired
	EntityManager em;
	
	public User save(User user) {
		if (user.getUserid()==null) {
			em.persist(user);
		}
		else {
			em.merge(user);
		}
		return user;
	}
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> findByUserPassword(String username, String password) {
		Query query = em.createNativeQuery("SELECT * FROM User where username =:username AND password = :password", User.class );
		query.setParameter("username", username);
		query.setParameter("password", password);
		return query.getResultList();
	}
}
