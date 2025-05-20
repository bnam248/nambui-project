package com.example.java5_asm.mapper;

import com.example.java5_asm.dto.GaleryDTO;
import com.example.java5_asm.dto.ProductDTO;
import com.example.java5_asm.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDTOMapper implements Function<ProductEntity, ProductDTO> {
    @Override
    public ProductDTO apply(ProductEntity productEntity) {
        return ProductDTO.builder()
                .id(productEntity.getId_product())
                .name(productEntity.getName_product())
                .price(productEntity.getPrice())
                .quantity(productEntity.getQuantity())
                .categoryId(productEntity.getCategory().getId_category())
                .galeries(
                        productEntity.getGaleries()
                                .stream()
                                .map(item -> new GaleryDTO(item.getThumbnai()))
                                .toList()
                )
                .build();
    }
}
