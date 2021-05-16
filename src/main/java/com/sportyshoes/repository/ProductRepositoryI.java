package com.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.model.Product;

public interface ProductRepositoryI extends JpaRepository<Product,Long>{


}
