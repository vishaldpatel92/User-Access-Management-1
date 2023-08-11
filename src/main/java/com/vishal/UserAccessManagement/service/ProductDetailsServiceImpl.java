package com.vishal.UserAccessManagement.service;

import com.vishal.UserAccessManagement.repository.ProductRepository;
import com.vishal.UserAccessManagement.repository.RoleRepository;
import com.vishal.UserAccessManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDetailsServiceImpl {
    @Autowired
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private ProductRepository productRepository;

    @Autowired
    public ProductDetailsServiceImpl(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
    }
}
