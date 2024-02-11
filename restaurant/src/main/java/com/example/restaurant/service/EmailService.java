package com.example.restaurant.service;

import com.example.restaurant.dto.Mail;

public interface EmailService {
    public void sendCodeByMail(Mail mail);
}
