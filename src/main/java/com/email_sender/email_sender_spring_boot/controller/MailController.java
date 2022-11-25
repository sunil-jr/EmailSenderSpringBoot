package com.email_sender.email_sender_spring_boot.controller;

import com.email_sender.email_sender_spring_boot.model.SendEmailRequest;
import com.email_sender.email_sender_spring_boot.service.MailService;
import com.email_sender.email_sender_spring_boot.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final MailService mailService;

    public MailController(@Qualifier("mailService") MailServiceImpl mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/email/send")
    public void sendEmail(@RequestBody SendEmailRequest emailRequest) {
        mailService.sendEmail(emailRequest);
    }
}
