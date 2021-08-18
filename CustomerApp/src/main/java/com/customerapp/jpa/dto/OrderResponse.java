package com.customerapp.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

    private String name;
    private String productName;
     private String paymenttype;
    public OrderResponse(String name, String productName, String paymenttype) {
        this.name = name;
        this.productName = productName;
        this.paymenttype = paymenttype;
    }

    private int price;
}
