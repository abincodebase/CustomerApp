package com.customerapp.jpa.repository;

import com.customerapp.jpa.dto.OrderResponse;
import com.customerapp.jpa.entity.CustomerDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerDetails,Integer> {

	
		
	
   @Query("SELECT new com.customerapp.jpa.dto.OrderResponse(p.productId, p.productName,p.productLevel,p.premium)	FROM ProductDetails p INNER JOIN ProductSubscription c ON  p.productId=c.productId and c.customerId=:customerId")
    public List<OrderResponse> getJoinInformation( @Param("customerId") int id);
   

//   @Query("SELECT new com.customerapp.jpa.dto.OrderResponse(c.customerName , p.productName,d.paymentType) FROM CustomerDetails c JOIN c.products p   JOIN c.payments d where customerId=:customerId")
//    public List<OrderResponse> getJoinInformation( @Param("customerId") String id);

}