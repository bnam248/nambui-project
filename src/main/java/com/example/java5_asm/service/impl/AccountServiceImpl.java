package com.example.java5_asm.service.impl;

import com.example.java5_asm.dto.AccountDTO;
import com.example.java5_asm.entity.AccountEntity;
import com.example.java5_asm.mapper.AccountDTOMapper;
import com.example.java5_asm.repo.AccountRepo;
import com.example.java5_asm.service.AccountService;
import com.example.java5_asm.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepo accountRepo;

    private final EmailService emailService;

    private final AccountDTOMapper accountDTOMapper;

    @Override
    public AccountDTO activeUser(String username) {
        AccountEntity entity = accountRepo.findById(username)
                .orElse(null);

        if (entity != null) {
            entity.setStatus(1);
            accountRepo.save(entity);
        }

        return accountDTOMapper.apply(entity);
    }

    @Override
    public AccountDTO findUserByUsernameAndPassword(String username, String password) {
        AccountEntity entity = accountRepo.findAccountEntityByUsernameAndPasswordAndStatus(username, password, 1)
                .orElse(null);
        if (entity == null)
            return null;
        return accountDTOMapper.apply(entity);
    }

    @Override
    public AccountDTO registrationUser(AccountDTO request) {
        if (accountRepo.existsAccountEntityByUsername(request.getUsername()))
            return null;

        AccountEntity save = accountRepo.save(
                AccountEntity.builder()
                        .username(request.getUsername())
                        .password(request.getPassword())
                        .email(request.getEmail())
                        .phone_numer(request.getPhoneNumber())
                        .Gender(request.getGender())
                        .password(request.getPassword())
                        .status(0)
                        .build()
        );
        String link = "http://localhost:8080/active-user?id=" + save.getUsername();
        emailService.sendMail(save.getEmail(), emailService.buildEmail(save.getEmail(), link), "Confirm account");

        return accountDTOMapper.apply(save);
    }

    @Override
    public List<AccountDTO> findAll() {
        List<AccountEntity> accountEntities = accountRepo.findAll();

        return accountEntities.stream()
                .map(accountDTOMapper)
                .toList();
    }

}
