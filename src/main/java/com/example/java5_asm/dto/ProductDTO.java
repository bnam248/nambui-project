package com.example.java5_asm.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO extends BaseDTO<ProductDTO> {
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    private String categoryId;
    private List<GaleryDTO> galeries;
}
