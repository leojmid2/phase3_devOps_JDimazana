package com.sportyshoes.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long purchaseId;
	
	private Long purchaseNum;
	
	@CreationTimestamp
	private LocalDateTime orderDate;
	
	//one order has many lineItem
	@OneToMany
	private List <LineItem> lineItems = new ArrayList<>();
	
	private Double subTotal;
	
	private Double salesTax;
	
	private Double total;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(Long purchaseId, Long purchaseNum, Double subTotal, Double salesTax, Double total) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseNum = purchaseNum;
		this.subTotal = subTotal;
		this.salesTax = salesTax;
		this.total = total;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Long getPurchaseNum() {
		return purchaseNum;
	}

	public void setPurchaseNum(Long purchaseNum) {
		this.purchaseNum = purchaseNum;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(Double salesTax) {
		this.salesTax = salesTax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
