package com.customerapp.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int custid;
    private String custName;
    private int custAge;
    private String custPhoneNumber;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "custid")
    private List<Product> products;
    @OneToMany(targetEntity = Payment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="py_fk",referencedColumnName = "custid")
    private List<Payment> payments;
}
