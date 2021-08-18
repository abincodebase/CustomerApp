package com.customerapp.jpa.entity;

import javax.persistence.*;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Payment {
    public int getIdpayment() {
		return idpayment;
	}
	public void setIdpayment(int idpayment) {
		this.idpayment = idpayment;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	@Id
    private int idpayment;
    private String paymenttype ;
    
   
}
