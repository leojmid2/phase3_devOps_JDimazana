package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.model.LineItem;
import com.sportyshoes.model.Purchase;
import com.sportyshoes.model.User;

public interface LineItemRepositoryI extends JpaRepository<LineItem,Long>{
	
	

	
	
}
