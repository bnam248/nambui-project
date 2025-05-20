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
@Table(name = "_account")
public class AccountEntity implements Serializable {
    @Id
    String username;
    String password;
    String email;
    Integer phone_numer;
    Boolean Gender;
    boolean admin;
    private Integer status;
    @OneToMany(mappedBy = "account")
    List<OrderEntity> orderEntities;
}
