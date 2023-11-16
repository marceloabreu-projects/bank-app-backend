package com.marcelo.javabanksys.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created. Please try again!";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account has been created successfully!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided account number does not exist. Please type a valid user.";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS_MESSAGE = "User successfully found.";
    public static final String ACCOUNT_CREDITED_CODE = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Your account has been credited successfully.";
    public static final String NOT_ENOUGH_BALANCE_CODE = "006";
    public static final String NOT_ENOUGH_BALANCE_MESSAGE = "Insufficient balance.";
    public static final String DEBIT_WITHDRAW_SUCCESS_CODE = "007";
    public static final String DEBIT_WITHDRAW_SUCCESS_MESSAGE = "Debit withdrawal successful.";
    public static final String DESTINATION_ACCOUNT_NOT_EXIST_CODE = "008";
    public static final String DESTINATION_ACCOUNT_NOT_EXIST_MESSAGE = "Destination account used does not exist. Please type an existing account number.";
    public static final String TRANSFER_SUCCESS_CODE = "009";
    public static final String TRANSFER_SUCCESS_MESSAGE = "Transfer was a success!";
    public static String generateAccountNumber(){
        //2023 + 6 random digits
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        //random number generation
        int randNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
        //convert to String + concatenation
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();
    }
}
