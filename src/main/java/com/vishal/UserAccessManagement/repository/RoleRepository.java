package com.vishal.UserAccessManagement.repository;

import com.vishal.UserAccessManagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
   <Optional>Role findByRoleName(String roleName);

//    Role createRole(Role );
}
