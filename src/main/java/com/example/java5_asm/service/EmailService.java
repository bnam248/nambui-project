package com.example.java5_asm.service;

public interface EmailService {

    void sendMail(String to, String email, String subject);

    String buildEmail(String email, String link);
}
