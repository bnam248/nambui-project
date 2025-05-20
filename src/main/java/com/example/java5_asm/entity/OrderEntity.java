package com.example.java5_asm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "_order")
public class OrderEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String address;
    @ManyToOne
    AccountEntity account;
    @OneToMany(mappedBy = "order")
    List<OrderDetailEntity> orderDetails;

}
