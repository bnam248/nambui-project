package com.example.java5_asm.repo;

import com.example.java5_asm.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
