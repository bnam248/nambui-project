package com.example.java5_asm.dto;

import com.example.java5_asm.entity.AccountEntity;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO extends BaseDTO<OrderDTO> {
    private Long id;
    private String address;
    private Date createDate = new Date();
}
