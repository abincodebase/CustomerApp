package com.customerapp.jpa.entity;

 

import javax.persistence.*;
import java.util.List;

 
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int custid;
    private String custName;
    private int custAge;
    private String custPhoneNumber;
    
    public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}
	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "custid")
    private List<Product> products;
    @OneToMany(targetEntity = Payment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="py_fk",referencedColumnName = "custid")
    private List<Payment> payments;
}
