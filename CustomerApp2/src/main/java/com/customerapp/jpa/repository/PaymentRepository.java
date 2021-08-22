 
package com.customerapp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerapp.jpa.entity.PaymentMethod;
import com.customerapp.jpa.entity.ProductDetails;

public interface PaymentRepository extends JpaRepository<PaymentMethod,Integer> {
}
