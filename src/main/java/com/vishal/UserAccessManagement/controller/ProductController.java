package com.vishal.UserAccessManagement.controller;


import com.vishal.UserAccessManagement.exception.ProductNotFoundException;
import com.vishal.UserAccessManagement.model.Product;
import com.vishal.UserAccessManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/product")
    Product newProduct(@RequestBody Product newProduct){
        return productRepository.save(newProduct);
    }

    @GetMapping("/products")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable Long id)
    {
        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException(id));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/product/{id}")
    Product productUser(@RequestBody Product newProduct, @PathVariable Long id) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setProductName(newProduct.getProductName());
                    product.setPrice(newProduct.getPrice());
                    return productRepository.save(product);
                }).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/product/{id}")
    String deleteProduct(@PathVariable Long id){
        if(!productRepository.existsById(id)){
            throw new ProductNotFoundException(id);
        }
        productRepository.deleteById(id);
        return  "Product with id "+id+" has been deleted successfully.";
    }
}
