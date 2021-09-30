package com.wsiz.company.service;

import com.wsiz.company.model.CustomerEntity;
import com.wsiz.company.model.Payment;
import com.wsiz.company.model.PaymentEntity;
import com.wsiz.company.repository.CustomerRepository;
import com.wsiz.company.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final CustomerRepository customerRepository;

    public PaymentEntity addPayment(Payment payment) {
        CustomerEntity customer = customerRepository.getById(payment.getCustomerId());
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setName(payment.getName());
        paymentEntity.setAmount(payment.getAmount());
        paymentEntity.setCustomer(customer);
        return paymentRepository.save(paymentEntity);
    }
}
