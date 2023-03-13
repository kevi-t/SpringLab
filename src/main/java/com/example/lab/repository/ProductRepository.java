package com.example.lab.repository;

import com.example.lab.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    Optional<Product> findByName(String name);
}
