package com.customerapp.jpa.repository;

import com.customerapp.jpa.dto.OrderResponse;
import com.customerapp.jpa.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT new com.customerapp.jpa.dto.OrderResponse(c.custName , p.productName,d.paymenttype) FROM Customer c JOIN c.products p   JOIN c.payments d")
    public List<OrderResponse> getJoinInformation();
}
