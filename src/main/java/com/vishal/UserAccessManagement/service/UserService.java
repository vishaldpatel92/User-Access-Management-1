package com.vishal.UserAccessManagement.service;

import com.vishal.UserAccessManagement.exception.RoleNotFoundException;
import com.vishal.UserAccessManagement.model.Role;
import com.vishal.UserAccessManagement.model.User;
import com.vishal.UserAccessManagement.repository.RoleRepository;
import com.vishal.UserAccessManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Optional<User> login(String username, String password) {
        // Implement login logic here, e.g., fetching user by username and password
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public User createUser(String username, String password, String roleName) {
        Role role = roleRepository.findByRoleName(roleName);
        if (role == null) {
            throw new RoleNotFoundException("Role not found: " + roleName);
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole((Set<Role>) role);

        return userRepository.save(user);
    }

   /* public boolean isAdmin(User user) {
        return user.getRole().getName().equals("ADMIN");
    }*/
}
