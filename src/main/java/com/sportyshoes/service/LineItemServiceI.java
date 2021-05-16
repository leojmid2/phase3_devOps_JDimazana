package com.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import com.sportyshoes.model.LineItem;

public interface LineItemServiceI {
	
	public void save(LineItem lineItem);
	
	public void delete(LineItem lineItem);

}
