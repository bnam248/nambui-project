package com.example.java5_asm.service.impl;

import com.example.java5_asm.dto.CategoryDTO;
import com.example.java5_asm.entity.CategoryEntity;
import com.example.java5_asm.mapper.CategoryDTOMapper;
import com.example.java5_asm.repo.CategoryRepo;
import com.example.java5_asm.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    private final CategoryDTOMapper categoryDTOMapper;

    @Override
    public CategoryDTO addCategory(CategoryDTO request) {
        if (categoryRepo.existsCategoryEntityByName_category(request.getName()))
            return null;

        CategoryEntity save = categoryRepo.save(
                CategoryEntity.builder()
                        .id_category(request.getId())
                        .name_category(request.getName())
                        .description(request.getDescription())
                        .build()
        );

        return categoryDTOMapper.apply(save);
    }

    @Override
    public List<CategoryDTO> findCategories() {
        List<CategoryEntity> categoryEntities = categoryRepo.findAll();

        return categoryEntities.stream()
                .map(categoryDTOMapper)
                .toList();
    }
}
