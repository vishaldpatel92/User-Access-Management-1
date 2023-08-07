package com.vishal.UserAccessManagement.repository;


import com.vishal.UserAccessManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByProductName(String productName);
}
