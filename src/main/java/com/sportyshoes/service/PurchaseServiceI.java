package com.sportyshoes.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.sportyshoes.model.Category;
import com.sportyshoes.model.DisplayPurchase;
import com.sportyshoes.model.Purchase;

public interface PurchaseServiceI {
	
	public void save(Purchase purchase);
	
	public void delete(Purchase purchase);
	
	public List<Purchase> findByDate(Date date);
	
	public List<DisplayPurchase> findByCategory(Category category);

}
