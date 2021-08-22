package com.customerapp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerapp.jpa.entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails,Integer> {
}
