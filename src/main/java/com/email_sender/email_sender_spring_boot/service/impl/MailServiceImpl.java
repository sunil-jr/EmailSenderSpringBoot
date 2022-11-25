package com.email_sender.email_sender_spring_boot.service.impl;

import com.email_sender.email_sender_spring_boot.model.SendEmailRequest;
import com.email_sender.email_sender_spring_boot.service.MailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service(value = "mailService")
public class MailServiceImpl implements MailService {

    private JavaMailSender javaMailSender;

    public MailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(SendEmailRequest request) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(request.getTo().toArray(String[]::new));
        if (request.getCc() != null && !request.getCc().isEmpty())
            mail.setCc(request.getCc().toArray(String[]::new));
        mail.setBcc(request.getBcc().toArray(String[]::new));
        mail.setText(request.getBody());
        mail.setSubject(request.getSubject());
        javaMailSender.send(mail);
    }
}
