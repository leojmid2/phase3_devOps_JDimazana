package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Product;
import com.sportyshoes.repository.ProductRepositoryI;

@Service
@Transactional
public class ProductServiceImp implements ProductServiceI {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepositoryI productRepository;
	
	
	@Override
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);

	}

	@Override
	public List<Product> findAll() {
		logger.info("Retrieve all products");
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		 return productRepository.findById(id);
	}
}
