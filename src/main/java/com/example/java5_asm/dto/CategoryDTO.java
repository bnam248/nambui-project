package com.example.java5_asm.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO extends BaseDTO<CategoryDTO> {
    private String id;
    private String name;
    private String description;
}
