package com.ttn.SpringSecurity.Repository;

import com.ttn.SpringSecurity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findByCode(String Code);
}
