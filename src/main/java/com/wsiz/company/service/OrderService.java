package com.wsiz.company.service;

import com.wsiz.company.model.*;
import com.wsiz.company.repository.CustomerRepository;
import com.wsiz.company.repository.OrderDetailRepository;
import com.wsiz.company.repository.OrderRepository;
import com.wsiz.company.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    public OrderEntity addOrder(Order order) {
        ProductEntity product = productRepository.getById(order.getProductId());
        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
        orderDetailEntity.setProduct(product);
        OrderDetailEntity savedOrderDetails = orderDetailRepository.save(orderDetailEntity);

        CustomerEntity customer = customerRepository.getById(order.getCustomerId());
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCustomer(customer);
        orderEntity.setOrderDetails(savedOrderDetails);
        return orderRepository.save(orderEntity);
    }
}
