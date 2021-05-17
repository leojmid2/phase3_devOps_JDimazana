package com.sportyshoes;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sportyshoes.model.Category;
import com.sportyshoes.model.DisplayPurchase;
import com.sportyshoes.model.LineItem;
import com.sportyshoes.model.Product;
import com.sportyshoes.model.Purchase;
import com.sportyshoes.model.User;
import com.sportyshoes.repository.ProductRepositoryI;
import com.sportyshoes.repository.PurchaseRepositoryI;
import com.sportyshoes.repository.UserRepository;
import com.sportyshoes.repository.UserRepositoryI;
import com.sportyshoes.service.CategoryServiceI;
import com.sportyshoes.service.LineItemServiceI;
import com.sportyshoes.service.ProductServiceI;
import com.sportyshoes.service.ProductServiceImp;
import com.sportyshoes.service.PurchaseServiceI;

@SpringBootApplication
public class SportyShoesApplication { //implements CommandLineRunner{
	
/*	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRepositoryI userJpaRepository;
	
	
	@Autowired
	private ProductServiceI productService;
	
	@Autowired
	private CategoryServiceI categoryService;

	@Autowired
	private LineItemServiceI lineItemService;

	@Autowired
	private PurchaseServiceI purchaseService;
*/	
	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}
	

	public void run(String... args) throws Exception {
	
		/******USER TEST*********/
		//firstName, lastName, username, email, String role,password
		//userRepository.save(new User("Jack","Sparrow","js","js@yahoo.com","user","pw"));

		/*
		 * Using entity Manager 
		 */
		/*
		User user = userRepository.findById(13L);
		logger.info("user : " + user );
	
		List<User> users= userRepository.findByUserPassword("jd", "password");
		if (!users.isEmpty()) {
			User u = (User) users.get(0);
			logger.info("user found! " + u  );
		}
		else
			logger.info("user not found" );
*/
		//end Entity Manager 
		
		/**
		 * using JpaRepository interface
		 */
	/*	Optional<User> userOpt = userJpaRepository.findById(5L);
		logger.info("check if user exist " + userOpt.isPresent()  );
		
		List<User> us = userJpaRepository.findByUsernameAndPassword("jd", "password");
		
		logger.info("user based on username and password " + us);
		User validUser =null;
		if (!us.isEmpty()) {
			validUser = us.get(0);
		}
		
		
		//update User
		if (validUser != null) {
			validUser.setPassword("new");
			userJpaRepository.save(validUser);
		}
		
		//new user
		User newUser = new User("Han","Solo","hs","hs@yahoo.com","user","pw");
		userJpaRepository.save(newUser);
		
		*/
		

		/******* PRODUCT TEST ***********/
	/*	
		Category category = categoryService.findById(1L);
		//Product p1 = new Product("Air Jordan 7",200.00, category);
		//productService.save(p1);
		
		List<Product> products = productService.findAll();
		logger.info("List of all products: "+ products.get(1).getName());
		
	*/	
		/****** PURCHASE TEST AND LINE ITEM  *****/
		/*
		 * 
		Optional<Product> p1 = productService.findById(1L);
		Product pp1 = p1.get();
		
		LineItem l1 = new LineItem();
		l1.setProduct(pp1);
		l1.setQuantity(1L);
		
		Optional<Product> p2 = productService.findById(2L);
		Optional<Product> p3 = productService.findById(2L);
		
		LineItem l2 = new LineItem(p2.get(),1L);
		LineItem l3 = new LineItem(p3.get(),1L);
		
		List<LineItem> items = new ArrayList<LineItem>();
		items.add(l1);
		items.add(l2);
		items.add(l3);
		
		Purchase purchase = new Purchase();
		purchase.setLineItems(items);
		purchase.setPurchaseNum(1002L);
		purchase.setTotal(300.50);
		
		//LocalDateTime now = LocalDateTime.now(); 
		//LocalDate localDate = new LocaDate();
		Date date = Date.valueOf("2021-05-17");
		purchase.setPurchaseDate(date);
		
		l1.setPurchase(purchase);
		l2.setPurchase(purchase);
		l3.setPurchase(purchase);
				
		purchaseService.save(purchase);
		
		lineItemService.save(l1);
		lineItemService.save(l2);
		lineItemService.save(l3);
		*/
		
		/***** FindByDate ***/
/*		Date date = Date.valueOf("2021-05-17");
		List<Purchase> purchases= purchaseService.findByDate(date);
		for (Purchase p:purchases) {
			logger.info("purchase " + p.getPurchaseNum());
		}
		
		Category category1 = new Category();
		category1.setCatId(5L);
		
		List<DisplayPurchase> dp = purchaseService.findByCategory(category1);
		logger.info("purchase " + dp.isEmpty());
*/	}	

}
