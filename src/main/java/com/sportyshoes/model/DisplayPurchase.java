package com.sportyshoes.model;

import java.math.BigInteger;
import java.util.Date;

public class DisplayPurchase {
	
	private BigInteger purchaseId;
	
	private Date purchaseDate;
	
	private String name;
	
	private Double price;

	
	
	public DisplayPurchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DisplayPurchase(BigInteger purchaseId, Date purchaseDate, String name, Double price) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.name = name;
		this.price = price;
	}

	public BigInteger getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(BigInteger purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
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

	@Override
	public String toString() {
		return "displayPurchase [purchaseNum=" + purchaseId + ", purchaseDate=" + purchaseDate + ", name=" + name
				+ ", price=" + price + "]";
	}
	
	

}
