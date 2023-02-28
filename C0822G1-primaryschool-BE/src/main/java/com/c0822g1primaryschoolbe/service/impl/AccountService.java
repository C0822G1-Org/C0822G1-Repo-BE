package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.repository.IAccountRepository;
import com.c0822g1primaryschoolbe.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }
}