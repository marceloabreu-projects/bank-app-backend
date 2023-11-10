package com.marcelo.javabanksys.service;

import com.marcelo.javabanksys.dto.BankResponse;
import com.marcelo.javabanksys.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
