package com.ttn.SpringSecurity.Controller;

import com.ttn.SpringSecurity.Repository.ProductRepository;
import com.ttn.SpringSecurity.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productapi")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping(value = "/products")
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping(value = "/products/{prod_name}")
    public Product getCoupons(@PathVariable("prod_name") String code) {
        return productRepository.findByCode(code);
    }

}
