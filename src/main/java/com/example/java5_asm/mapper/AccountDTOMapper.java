package com.example.java5_asm.mapper;

import com.example.java5_asm.dto.AccountDTO;
import com.example.java5_asm.entity.AccountEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AccountDTOMapper implements Function<AccountEntity, AccountDTO> {
    @Override
    public AccountDTO apply(AccountEntity entity) {
        return AccountDTO.builder()
                .username(entity.getUsername())
                .phoneNumber(entity.getPhone_numer())
                .admin(entity.isAdmin())
                .email(entity.getEmail())
                .Gender(entity.getGender())
                .build();
    }
}
