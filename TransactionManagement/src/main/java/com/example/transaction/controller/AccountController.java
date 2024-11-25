package com.example.transactiondemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public String createAccount(@RequestParam String name, @RequestParam Double balance) {
        try {
            accountService.createAccount(name, balance);
            return "Account created successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
