package com.example.java5_asm.service;

import com.example.java5_asm.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    AccountDTO activeUser(String username);
    AccountDTO findUserByUsernameAndPassword(String username, String password);

    AccountDTO registrationUser(AccountDTO request);

    List<AccountDTO> findAll();
}
