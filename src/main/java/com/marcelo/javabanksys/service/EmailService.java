package com.marcelo.javabanksys.service;

import com.marcelo.javabanksys.dto.EmailDetails;

public interface EmailService {
    void SendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
