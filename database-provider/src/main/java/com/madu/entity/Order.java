package com.madu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String creationDate;

    private String closingDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity responsibleCustomer;

    private String orderStatus;

    private Double discountValue;

    private Double totalOrderValue;

}

