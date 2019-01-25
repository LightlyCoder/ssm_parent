package com.yang.controller;

import com.yang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(){
        accountService.findAll();
        return "list";
    }
}
