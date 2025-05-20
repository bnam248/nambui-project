package com.example.java5_asm.dto;

import com.example.java5_asm.entity.OrderEntity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO extends BaseDTO<AccountDTO> {
    private String username;
    private String password;
    private String email;
    private Integer phoneNumber;
    private Boolean Gender;
    private boolean admin;
    private List<OrderDTO> orders;
}
