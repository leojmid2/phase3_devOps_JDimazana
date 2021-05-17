package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import com.sportyshoes.model.Category;

public interface CategoryServiceI {
	
	public Category findById(Long id);
	
	public List<Category> findByAll();

}
