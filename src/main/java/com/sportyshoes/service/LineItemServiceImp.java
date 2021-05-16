package com.sportyshoes.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.LineItem;
import com.sportyshoes.repository.LineItemRepositoryI;

@Service
@Transactional
public class LineItemServiceImp implements LineItemServiceI {

	@Autowired
	LineItemRepositoryI repository;
	
	@Override
	public void save(LineItem lineItem) {
		repository.save(lineItem);

	}

	@Override
	public void delete(LineItem lineItem) {
		repository.delete(lineItem);

	}
	

}
