package com.example.java5_asm.repo;

import com.example.java5_asm.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepo extends JpaRepository<CategoryEntity, String> {

    @Query("""
            SELECT o FROM CategoryEntity o WHERE o.name_category = ?1
            """)
    boolean existsCategoryEntityByName_category(String name_category);
}
