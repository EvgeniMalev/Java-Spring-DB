package com.example.transactiondemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.transactiondemo.entity.TransactionLog;

public interface TransactionLogRepository extends JpaRepository<TransactionLog, Long> {
}
