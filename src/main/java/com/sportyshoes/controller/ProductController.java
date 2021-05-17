package com.sportyshoes.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportyshoes.model.Category;
import com.sportyshoes.model.DisplayPurchase;
import com.sportyshoes.model.LineItem;
import com.sportyshoes.model.Product;
import com.sportyshoes.model.Purchase;
import com.sportyshoes.service.CategoryServiceI;
import com.sportyshoes.service.ProductServiceI;
import com.sportyshoes.service.PurchaseServiceI;

@Controller
public class ProductController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductServiceI productService;

	@Autowired
	CategoryServiceI categoryService;
	
	@Autowired
	PurchaseServiceI purchaseService;

	
	@RequestMapping(value = "/showProducts",  method = RequestMethod.GET)
	public ModelAndView showSignedUsers() {
		logger.info("Show all products");
		List<Product> products = productService.findAll();
 		return new ModelAndView("showProducts", "products", products);
	}
	
	@RequestMapping(value = "/viewReport",  method = RequestMethod.GET)
	public String search(Model model, HttpSession session) {
		
		List<Category> categories = categoryService.findByAll();
		session.setAttribute("categories", categories);
		return "search";
	}
	
	@RequestMapping(value = "/search",  method = RequestMethod.GET)
	public String reportByDate(Model model, @RequestParam String dop, @RequestParam String category, @RequestParam String type) {
		
		if (type.contentEquals("1")) {
			logger.info("Show all purchases by Date");
			if(!dop.isEmpty()){
				Date date = Date.valueOf(dop);
				List<Purchase> purchases = purchaseService.findByDate(date);
			
				/*for (Purchase p:purchases) {
					logger.info("P "+ p.getPurchaseId());
					for (LineItem l:p.getLineItems()) {
						logger.info("product "+ l.getProduct().getName());
					}
				}*/
				
		 		//return new ModelAndView("showReportByDate", "purchases", purchases);
				model.addAttribute("purchases",purchases);
				model.addAttribute("dop",dop);
				return "showReportByDate";
				}
			model.addAttribute("message", "Please select date");
			return "search";
		}
		else {
			logger.info("Show all purchases by Category");
			Long id = Long.valueOf(category);
			Category c = categoryService.findById(id);
			List<DisplayPurchase> dp = purchaseService.findByCategory(c);
			
			model.addAttribute("products", dp);
			model.addAttribute("category",c.getName());
			return "showReportByCategory";
		}
	}
	
}
