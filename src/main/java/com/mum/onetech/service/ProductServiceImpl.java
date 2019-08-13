package com.mum.onetech.service;

import com.mum.onetech.domain.Product;
import com.mum.onetech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(Long pid) {
        return productRepository.findById(pid).orElse(null);
    }

    @Override
    public List<Product> findAllByCategoryId(Long catId) {
        return productRepository.findAllByCategoryId(catId);
    }

    @Override
    public Long getCountByCategoryId(Long catId) {
        return productRepository.getCountByCategoryId(catId);
    }

    @Override
    public Long getCountAll() {
        return productRepository.getCountAll();
    }
}
