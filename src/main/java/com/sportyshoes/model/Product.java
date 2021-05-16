package com.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	private String name;
	
	private Double price;
	
	@ManyToOne
	private Category category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", category=" + category
//				+ "]";
//	}
	
	
	
}
