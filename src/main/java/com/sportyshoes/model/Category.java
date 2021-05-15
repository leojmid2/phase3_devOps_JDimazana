package com.sportyshoes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long catId;

	@Column(nullable=false)
	private String name;
	
	//one category has many shoes 	
	//mappedBy for non-owning only variable in the owning side
	@OneToMany (mappedBy="category")
	private List<Product> products = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Long catId, String name, List<Product> products) {
		super();
		this.catId = catId;
		this.name = name;
		this.products = products;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", name=" + name + ", products=" + products + "]";
	}

	
	
	
}
