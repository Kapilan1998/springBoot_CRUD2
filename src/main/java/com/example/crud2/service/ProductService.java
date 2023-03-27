package com.example.crud2.service;

import com.example.crud2.entity.Product;
import com.example.crud2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

              // this is used when we need to save multiple values at a time
//    public List<Product> saveAllProducts(List<Product> products){
//        return productRepository.saveAll(products)
//    }









}
