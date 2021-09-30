package com.wsiz.company.controller;

import com.wsiz.company.model.*;
import com.wsiz.company.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final EmployeeService employeeService;
    private final ProductService productService;
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final CustomerService customerService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Service works";
    }

    @PostMapping("/employee")
    public EmployeeEntity createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PostMapping("/customer")
    public CustomerEntity createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PostMapping("/product")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return productService.addProduct(product);
    }

    @PostMapping("/order")
    public OrderEntity addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PostMapping("/payment")
    public PaymentEntity addPayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }
}
