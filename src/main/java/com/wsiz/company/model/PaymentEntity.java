package com.wsiz.company.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private CustomerEntity customer;
}
