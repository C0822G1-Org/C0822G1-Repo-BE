package com.c0822g1primaryschoolbe.service;

import com.c0822g1primaryschoolbe.dto.request.ChangePasswordDto;
import com.c0822g1primaryschoolbe.entity.account.Account;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByUsername(String username);

    void save(Long accountId);

    void changePassword(ChangePasswordDto changePasswordDto) throws Exception;

}
