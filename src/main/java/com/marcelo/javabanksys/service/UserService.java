package com.marcelo.javabanksys.service;

import com.marcelo.javabanksys.dto.BankResponse;
import com.marcelo.javabanksys.dto.CreditDebitRequest;
import com.marcelo.javabanksys.dto.EnquiryRequest;
import com.marcelo.javabanksys.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
