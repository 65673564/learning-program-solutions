package com.example;

public class AlertSender {

    private SMSService smsService;

    public AlertSender(SMSService smsService) {
        this.smsService = smsService;
    }

    public void alert(String number) {
        smsService.sendSMS(number, "Alert! System down.");
    }
}
