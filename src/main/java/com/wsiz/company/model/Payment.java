package com.wsiz.company.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Payment {
    private String name;
    private BigDecimal amount;
    private Long customerId;
}
