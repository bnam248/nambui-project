package com.example.java5_asm.service.impl;

import com.example.java5_asm.dto.ProductDTO;
import com.example.java5_asm.entity.ProductEntity;
import com.example.java5_asm.mapper.ProductDTOMapper;
import com.example.java5_asm.repo.ProductRepo;
import com.example.java5_asm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    private final ProductDTOMapper productDTOMapper;

    @Override
    public List<ProductDTO> findProducts() {
        List<ProductEntity> products = productRepo.findAll();
        return products.stream()
                .map(productDTOMapper)
                .toList();
    }
}
