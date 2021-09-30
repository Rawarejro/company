package com.wsiz.company.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private CustomerEntity customer;

    @OneToOne
    @JoinColumn(name = "order_details", referencedColumnName = "id")
    private OrderDetailEntity orderDetails;
}
