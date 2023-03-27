package com.example.crud2.controller;

import com.example.crud2.entity.Product;
import com.example.crud2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/findProducts")
    public  List<Product> findAllProducts(){
        return productService.getProduct();
    }

    @GetMapping("/findProductById/{id}")
    public  Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/findProductByName/{name}")
    public  Product findProductById(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

}
