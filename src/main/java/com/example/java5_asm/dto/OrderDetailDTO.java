package com.example.java5_asm.dto;

import com.example.java5_asm.entity.ProductEntity;
import lombok.Data;

@Data
public class OrderDetailDTO extends BaseDTO<OrderDetailDTO>{
    private Long id;
    private Double price;
    private Integer quantity;
    private ProductEntity product;
    private OrderDTO order;
}
