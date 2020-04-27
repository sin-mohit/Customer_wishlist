package com.techms.itemwishlist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "wishlists")
public class CustomerWishList {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
    @Column(name = "customerId")
	private String customerId;
    
    @Column(name = "customerName")
	private String customerName;
    
    @Column(name = "itemName")
	private String itemName;
	
	public CustomerWishList() {

	}

	public CustomerWishList(Integer id, String customerId, String customerName, String itemName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.itemName = itemName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
