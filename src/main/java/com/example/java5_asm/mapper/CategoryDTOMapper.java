package com.example.java5_asm.mapper;

import com.example.java5_asm.dto.CategoryDTO;
import com.example.java5_asm.entity.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class CategoryDTOMapper implements Function<CategoryEntity, CategoryDTO> {
    @Override
    public CategoryDTO apply(CategoryEntity categoryEntity) {
        return CategoryDTO.builder()
                .id(categoryEntity.getId_category())
                .name(categoryEntity.getName_category())
                .description(categoryEntity.getDescription())
                .build();
    }
}
