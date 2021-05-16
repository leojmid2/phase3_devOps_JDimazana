package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import com.sportyshoes.model.Product;
import com.sportyshoes.model.User;

public interface ProductServiceI {
	
	public void save(Product product);
	
	public void delete(Product product);
	
	public List<Product> findAll();
	
	public Optional<Product> findById(Long id);
	

}
