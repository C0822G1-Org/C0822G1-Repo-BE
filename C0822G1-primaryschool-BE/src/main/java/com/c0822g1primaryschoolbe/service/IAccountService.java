package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.entity.account.Account;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByUsername(String username);

    Boolean existsAccountByUsername(String username);

    Boolean existsAccountByEmail( String email);

    void save(Account account);
}
