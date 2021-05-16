package com.sportyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LineItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	
	//one line item has one product
	@OneToOne
	private Product product;
		
	@ManyToOne
	private Purchase purchase;
	
	
	@Column(nullable=false)
	private Long quantity;

	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public LineItem(Product product, Long quantity) {
		this.product = product;
		this.quantity = quantity;
	}



	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}


	
}
