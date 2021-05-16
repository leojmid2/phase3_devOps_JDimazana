package com.sportyshoes.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Category;
import com.sportyshoes.model.LineItem;
import com.sportyshoes.model.Purchase;
import com.sportyshoes.model.DisplayPurchase;
import com.sportyshoes.repository.PurchaseRepositoryI;

@Service
@Transactional
public class PurchaseServicesImp implements PurchaseServiceI {
	
	@Autowired
	PurchaseRepositoryI repository;

	@Override
	public void save(Purchase purchase) {
		repository.save(purchase);
	}

	@Override
	public void delete(Purchase purchase) {
		repository.delete(purchase);
	}

	@Override
	public List<Purchase> findByDate(Date date) {
		// TODO Auto-generated method stub
		return repository.findByPurchaseDate(date);
	}

	@Override
	public List<DisplayPurchase> findByCategory(Category category) {
		// TODO Auto-generated method stub
		//return repository.findByCategory(category.getCatId());
		List<DisplayPurchase> ds= new ArrayList<DisplayPurchase>();
		
		List<Object[]> rs = repository.findByCategory(category.getCatId());
		for (Object[] r : rs) {
			//map display purchase
			DisplayPurchase dp = new DisplayPurchase();
			dp.setPurchaseNum((BigInteger)r[0]);
			dp.setPurchaseDate((Date)r[1]);
			dp.setName((String)r[2]);
			dp.setPrice((Double)r[3]);
			ds.add(dp);
		}
	
		return ds;
	}

}
