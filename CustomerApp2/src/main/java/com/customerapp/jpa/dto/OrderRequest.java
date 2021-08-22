package com.customerapp.jpa.dto;

import com.customerapp.jpa.entity.CustomerDetails;



 
public class OrderRequest {

    public CustomerDetails getCustomerDetails() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	private CustomerDetails customer;
}
