package com.wsiz.company.service;

import com.wsiz.company.model.Customer;
import com.wsiz.company.model.CustomerEntity;
import com.wsiz.company.model.EmployeeEntity;
import com.wsiz.company.repository.CustomerRepository;
import com.wsiz.company.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;

    public CustomerEntity createCustomer(Customer customer) {
        EmployeeEntity employee = employeeRepository.getById(customer.getEmployeeId());
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setPhoneNo(customer.getPhoneNo());
        customerEntity.setEmployee(employee);
        return customerRepository.save(customerEntity);
    }
}
