package com.example.java5_asm.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_category")
public class CategoryEntity implements Serializable {
    @Id
    String id_category;
    String name_category;
    String description;
    @OneToMany(mappedBy = "category")
    List<ProductEntity> products;
}
