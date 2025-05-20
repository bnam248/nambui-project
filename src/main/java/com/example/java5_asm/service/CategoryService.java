package com.example.java5_asm.service;

import com.example.java5_asm.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    CategoryDTO addCategory(CategoryDTO request);

    List<CategoryDTO> findCategories();
}
