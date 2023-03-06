package com.c0822g1primaryschool.service.impl;

import com.c0822g1primaryschool.dto.request.ChangePasswordDto;
import com.c0822g1primaryschool.entity.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import com.c0822g1primaryschool.repository.IAccountRepository;
import com.c0822g1primaryschool.service.IAccountService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepository iAccountRepository;

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: authenticate account password
     *
     * @param username
     * @return account
     */
    @Override
    public Optional<Account> findByUsername(String username) {
        return iAccountRepository.findByUsername(username);
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * Create by : NuongHT
     * Date create: 28/02/2023
     * Description: create reponsitory call database and check account by method findByUserId
     */

    @Override
    public void save(Long accountId) {
        iAccountRepository.save(accountId);
    }

    @Override
    public void changePassword(ChangePasswordDto changePasswordDto) throws Exception {
        Account account = iAccountRepository.findByUserId(changePasswordDto.getAccountId());
        if (account == null) {
            throw new Exception("Account null");
        }
        account.setPassword(passwordEncoder.encode(changePasswordDto.getNewPass()));
        iAccountRepository.save(account);
    }
}

