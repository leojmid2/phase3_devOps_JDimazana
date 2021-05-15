package com.sportyshoes.model;

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

//@Entity
//@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	
	private Long orderNum;
	
	//private Date orderDate;
	
	//one order has many lineItem
	//@OneToMany(fetch=FetchType.LAZY)
	//private List <LineItem> lineItems = new ArrayList<>();
	
	private Double subTotal;
	
	private Double salesTax;
	
	private Double total;
	
	//private String email;
	//private String firstName;
	//private String lastName;
	


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	public Order(Long orderId, Long orderNum, Double subTotal, Double salesTax, Double total) {
		super();
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.subTotal = subTotal;
		this.salesTax = salesTax;
		this.total = total;
	}





	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public Long getOrderNum() {
		return orderNum;
	}



	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
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

	