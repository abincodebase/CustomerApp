package com.customerapp.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerapp.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
