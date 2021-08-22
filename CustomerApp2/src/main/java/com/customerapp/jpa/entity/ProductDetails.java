package com.customerapp.jpa.entity;

 
import javax.persistence.Entity;
import javax.persistence.Id;

 
@Entity
public class ProductDetails {
    public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductLevel() {
		return productLevel;
	}
	public void setProductLevel(String productLevel) {
		this.productLevel = productLevel;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	@Id
    private int productId;
    private String productName;
    private String productLevel;
    private int premium;
}
