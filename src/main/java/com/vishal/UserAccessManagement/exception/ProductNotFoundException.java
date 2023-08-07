package com.vishal.UserAccessManagement.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Could not find the product with id: "+id);
    }
}
