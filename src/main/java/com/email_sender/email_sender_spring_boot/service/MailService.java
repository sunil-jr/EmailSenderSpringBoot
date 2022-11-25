package com.email_sender.email_sender_spring_boot.service;

import com.email_sender.email_sender_spring_boot.model.SendEmailRequest;

public interface MailService {
    void sendEmail(SendEmailRequest request);
}
