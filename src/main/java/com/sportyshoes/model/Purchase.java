package com.sportyshoes.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long purchaseId;
	
	private Long purchaseNum;
	
	@CreationTimestamp
	private LocalDateTime creationDate;
	
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	
	//one order has many lineItem
	@OneToMany(mappedBy="purchase")
	private List <LineItem> lineItems = new ArrayList<>();
	
	private Double subTotal;
	
	private Double salesTax;
	
	private Double total;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(Long purchaseNum, List<LineItem> lineItems, Date purchaseDate, Double subTotal, Double salesTax, Double total) {
		super();
		this.purchaseNum = purchaseNum;
		this.lineItems = lineItems;
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

	public LocalDateTime getOrderDate() {
		return creationDate;
	}

	public void setOrderDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
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

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	

	
	
}
