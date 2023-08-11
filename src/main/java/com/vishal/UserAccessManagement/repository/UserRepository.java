package com.vishal.UserAccessManagement.repository;

import com.vishal.UserAccessManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username, String password);
    User save(User user);
}
