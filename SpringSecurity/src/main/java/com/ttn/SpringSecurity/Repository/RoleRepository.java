package com.ttn.SpringSecurity.Repository;

import com.ttn.SpringSecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}