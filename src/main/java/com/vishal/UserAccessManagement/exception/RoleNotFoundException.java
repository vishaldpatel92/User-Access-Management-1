package com.vishal.UserAccessManagement.exception;

public class RoleNotFoundException extends RuntimeException{
    public RoleNotFoundException(String roleName){
        super("Could not find the product with id: "+roleName);
    }
}
