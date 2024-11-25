package com.example.transactiondemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TransactionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;
    private String status;
}
