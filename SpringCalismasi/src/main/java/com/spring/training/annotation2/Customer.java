package com.spring.training.annotation2;

import org.springframework.beans.factory.annotation.Autowired;




public class Customer {
	private String name;
    @Autowired
	private Address customerAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	

}
