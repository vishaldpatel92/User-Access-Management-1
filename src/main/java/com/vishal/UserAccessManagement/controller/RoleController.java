package com.vishal.UserAccessManagement.controller;

import com.vishal.UserAccessManagement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

   /* @PostMapping
    public ResponseEntity<Optional<Role>> createRole(@RequestBody Role role) {
        Optional<Role> createdRole = roleRepository.findByRoleName(role.getRoleName());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRole);
    }*/
}
