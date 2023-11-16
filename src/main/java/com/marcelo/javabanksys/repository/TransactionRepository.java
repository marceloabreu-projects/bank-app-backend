package com.marcelo.javabanksys.repository;

import com.marcelo.javabanksys.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
