package com.email_sender.email_sender_spring_boot.service.impl;

import com.email_sender.email_sender_spring_boot.model.SendEmailRequest;
import com.email_sender.email_sender_spring_boot.service.MailService;
import org.springframework.stereotype.Service;

@Service(value = "amazonMailService")
public class AmazonMailSender implements MailService {
    @Override
    public void sendEmail(SendEmailRequest request) {
        // Send mail Using amazon
    }
}
