package com.wsiz.company.service;

import com.wsiz.company.model.ProductEntity;
import com.wsiz.company.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductEntity addProduct(ProductEntity product) {
        return productRepository.save(product);
    }
}
