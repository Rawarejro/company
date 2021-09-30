package com.wsiz.company.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "empsalary")
public class EmpsalaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department")
    private Department department;

    @Column(name = "salary")
    private BigDecimal salary;

    @OneToOne
    @JoinColumn(name = "employee", referencedColumnName = "id")
    private EmployeeEntity employeeEntity;
}
