package com.ttn.SpringSecurity.Repository;

import com.ttn.SpringSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}