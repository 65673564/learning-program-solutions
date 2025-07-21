package com.example;

public class UserRegistrar {

    private NotificationService notificationService;

    public UserRegistrar(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void register(String userEmail) {
        // Imagine saving user here...
        notificationService.sendEmail(userEmail);
    }
}
