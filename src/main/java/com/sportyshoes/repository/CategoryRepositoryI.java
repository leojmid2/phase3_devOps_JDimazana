package com.sportyshoes.repository;

import java.util.List;
import com.sportyshoes.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepositoryI extends JpaRepository<Category,Long>{


}
