package com.marcelo.javabanksys.service.implementation;

import com.marcelo.javabanksys.dto.EmailDetails;
import com.marcelo.javabanksys.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String senderEmail;


    @Override
    public void SendEmailAlert(EmailDetails emailDetails) {

    }
}
