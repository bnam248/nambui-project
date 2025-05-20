package com.example.java5_asm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "_product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_product;
    String name_product;
    String description;
    Double price;
    Integer quantity;
    @ManyToOne
    @JoinColumn(name = "id_category")
    CategoryEntity category;
    @OneToMany(mappedBy = "product")
    List<OrderDetailEntity> orderDetails;
    @OneToMany(mappedBy = "product")
    private List<GaleryEntity> galeries;

}
