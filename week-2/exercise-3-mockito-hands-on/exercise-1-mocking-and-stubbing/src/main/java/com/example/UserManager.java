package com.example;

public class UserManager {

    private EmailService emailService;

    public UserManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public String registerUser(String username) {
        return emailService.sendWelcomeEmail(username);
    }
}
