package com.marcelo.javabanksys.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created. Please try again!";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account has been created successfully!";

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
