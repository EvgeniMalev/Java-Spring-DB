package com.example.transactiondemo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.transactiondemo.entity.Account;
import com.example.transactiondemo.entity.TransactionLog;
import com.example.transactiondemo.repository.AccountRepository;
import com.example.transactiondemo.repository.TransactionLogRepository;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final TransactionLogRepository logRepository;

    public AccountService(AccountRepository accountRepository, TransactionLogRepository logRepository) {
        this.accountRepository = accountRepository;
        this.logRepository = logRepository;
    }

    @Transactional
    public void createAccount(String name, Double initialBalance) {
        Account account = new Account();
        account.setName(name);
        account.setBalance(initialBalance);
        accountRepository.save(account);

        TransactionLog log = new TransactionLog();
        log.setAction("CREATE_ACCOUNT");
        log.setStatus("SUCCESS");

        if (initialBalance < 0) {
            throw new RuntimeException("Initial balance cannot be negative!");
        }

        logRepository.save(log);
    }
}
