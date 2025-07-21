package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class AlertSenderTest {

    @Test
    void testSendSMSWithDoNothing() {
        SMSService mockSMS = mock(SMSService.class);
        doNothing().when(mockSMS).sendSMS(anyString(), anyString());

        AlertSender sender = new AlertSender(mockSMS);
        sender.alert("9999999999");

        verify(mockSMS).sendSMS("9999999999", "Alert! System down.");
    }

    @Test
    void testSendSMSThrowsException() {
        SMSService mockSMS = mock(SMSService.class);
        doThrow(new RuntimeException("SMS failed")).when(mockSMS).sendSMS(eq("9999"), anyString());

        AlertSender sender = new AlertSender(mockSMS);

        try {
            sender.alert("9999");
        } catch (RuntimeException ex) {
            assert(ex.getMessage().equals("SMS failed"));
        }
    }
}
