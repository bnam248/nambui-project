package com.example.java5_asm.repo;

import com.example.java5_asm.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<AccountEntity, String> {

    boolean existsAccountEntityByUsername(String username);

    Optional<AccountEntity> findAccountEntityByUsernameAndPasswordAndStatus(String username, String password, Integer status);
}
