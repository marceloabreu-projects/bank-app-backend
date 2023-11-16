package com.marcelo.javabanksys.service;

import com.marcelo.javabanksys.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
