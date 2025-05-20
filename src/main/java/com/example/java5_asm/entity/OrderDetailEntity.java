package com.example.java5_asm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "_orderDetail")
public class OrderDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    Integer quantity;
    Date orderDate;
    @ManyToOne
    @JoinColumn(name = "product_id")
    ProductEntity product;
    @ManyToOne
    @JoinColumn(name = "order_id")
    OrderEntity order;

}
