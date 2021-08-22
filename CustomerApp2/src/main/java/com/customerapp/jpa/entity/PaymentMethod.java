package com.customerapp.jpa.entity;

import javax.persistence.*;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PaymentMethod {
 
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Id
    private int paymentId;
    private String paymentType ;
    
   
}
