package com.customerapp.jpa.dto;

import com.customerapp.jpa.entity.Customer;



 
public class OrderRequest {

    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private Customer customer;
}
