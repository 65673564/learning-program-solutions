package com.example;

public class Notifier {

    private MessageService messageService;

    public Notifier(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String user) {
        messageService.sendMessage(user, "Hello from Raji!");
    }
}
