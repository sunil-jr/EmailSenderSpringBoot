package com.email_sender.email_sender_spring_boot.service.impl;

import com.email_sender.email_sender_spring_boot.model.SendEmailRequest;
import com.email_sender.email_sender_spring_boot.service.MailService;
import org.springframework.stereotype.Service;

@Service(value = "sendGridMailService")
public class SendGridMailServiceImpl implements MailService {

    @Override
    public void sendEmail(SendEmailRequest request) {
        // Send Using sendGrid
    }
}
