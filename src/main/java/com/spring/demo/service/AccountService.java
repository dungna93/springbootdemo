package com.spring.demo.service;

import com.spring.demo.entity.Account;
import com.spring.demo.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @created: 28/12/2023 - 9:51 PM
 * @author: dungna
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccount() {
        List<Account> result = accountRepository.findAll();
        return result;
    }
}
