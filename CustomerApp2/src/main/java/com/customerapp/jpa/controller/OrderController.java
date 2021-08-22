package com.customerapp.jpa.controller;

import com.customerapp.jpa.dto.OrderRequest;
import com.customerapp.jpa.dto.OrderResponse;
import com.customerapp.jpa.entity.CustomerDetails;
import com.customerapp.jpa.repository.CustomerRepository;
import com.customerapp.jpa.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public CustomerDetails placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomerDetails());
    }

    @GetMapping("/findAllOrders")
    public List<CustomerDetails> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo//{id}")
    public List<OrderResponse> getJoinInformation(@PathVariable int id){
        return customerRepository.getJoinInformation(id);
    }
}
