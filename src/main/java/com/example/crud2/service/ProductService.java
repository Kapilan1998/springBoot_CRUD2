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
    public List<Product> saveAllProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null  );
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Product id of "+id+" was removed sucessfully";
    }

    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepository.save(existingProduct);
    }


    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }
}
