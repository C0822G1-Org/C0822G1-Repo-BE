package com.c0822g1primaryschoolbe.service.impl;

import com.c0822g1primaryschoolbe.entity.account.Account;
import com.c0822g1primaryschoolbe.repository.IAccountRepository;
import com.c0822g1primaryschoolbe.service.principle.AccountPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailService implements UserDetailsService {
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Account không tìm thấy -> username hoặc password" + username));

        return AccountPrinciple.build(account);
    }
}
