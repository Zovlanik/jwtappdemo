package com.zovlanik.jwtappdemo.repository;

import com.zovlanik.jwtappdemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
