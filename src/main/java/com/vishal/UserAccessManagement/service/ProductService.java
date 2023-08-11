package com.vishal.UserAccessManagement.service;

import com.vishal.UserAccessManagement.model.Product;
import com.vishal.UserAccessManagement.model.User;
import com.vishal.UserAccessManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(String productName, double productPrice, User adminUser) {
        /*if (!adminUser.isAdmin()) {
            throw new UnauthorizedAccessException("Only admin can add products");
        }*/

        Product product = new Product(productName, productPrice);
        return productRepository.save(product);
    }

    public List<Product> searchProducts() {
        return productRepository.findAll();
    }
}
