package com.sportyshoes.model;

import java.math.BigInteger;
import java.util.Date;

public class DisplayPurchase {
	
	private BigInteger purchaseNum;
	
	private Date purchaseDate;
	
	private String name;
	
	private Double price;

	
	
	public DisplayPurchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DisplayPurchase(BigInteger purchaseNum, Date purchaseDate, String name, Double price) {
		super();
		this.purchaseNum = purchaseNum;
		this.purchaseDate = purchaseDate;
		this.name = name;
		this.price = price;
	}

	public BigInteger getPurchaseNum() {
		return purchaseNum;
	}

	public void setPurchaseNum(BigInteger purchaseNum) {
		this.purchaseNum = purchaseNum;
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
		return "displayPurchase [purchaseNum=" + purchaseNum + ", purchaseDate=" + purchaseDate + ", name=" + name
				+ ", price=" + price + "]";
	}
	
	

}
