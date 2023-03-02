package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.repository.IAccountRepository;
import com.c0822g1primaryschoolbe.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepository iAccountRepository;

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: findByUserName
     *
     * @param username
     * @return account
     */
    @Override
    public Optional<Account> findByUsername(String username) {
        return iAccountRepository.findByUsername(username);
    }

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: findByUserName
     *
     * @param username
     * @return true false
     */
    @Override
    public Boolean existsAccountByUsername(String username) {
        return iAccountRepository.existsAccountByUsername(username);
    }

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: findByUserName
     *
     * @param email
     * @return true false
     */
    @Override
    public Boolean existsAccountByEmail(String email) {
        return iAccountRepository.existsAccountByEmail(email);
    }

    /**
     * Created by: SyTV
     * Date created: 27/02/2023
     * Function: findByUserName
     *
     * @param account
     *
     */
    @Override
    public void save(Account account) {
        iAccountRepository.save(account);
    }

}
