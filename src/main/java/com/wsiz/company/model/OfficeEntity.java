package com.wsiz.company.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "office")
public class OfficeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;
}
