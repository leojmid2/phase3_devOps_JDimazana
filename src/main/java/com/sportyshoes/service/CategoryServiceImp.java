package com.sportyshoes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Category;
import com.sportyshoes.repository.CategoryRepositoryI;

@Service
public class CategoryServiceImp implements CategoryServiceI {

	@Autowired
	CategoryRepositoryI categoryRepository;
	
	@Override
	public Category findById(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}

}
