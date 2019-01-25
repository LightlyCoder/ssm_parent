package com.yang.service.impl;

import com.yang.dao.IAccountDao;
import com.yang.domain.Account;
import com.yang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl:findAll()");
        List<Account> accounts = accountDao.findAll();
        System.out.println(accounts);
        return null;
    }
}
