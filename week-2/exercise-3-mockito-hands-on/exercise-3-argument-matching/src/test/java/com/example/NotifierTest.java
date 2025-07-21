package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

class NotifierTest {

    @Test
    void testSendMessageWithAnyUser() {
        MessageService mockMessageService = mock(MessageService.class);
        Notifier notifier = new Notifier(mockMessageService);

        notifier.notifyUser("raji@example.com");

        verify(mockMessageService).sendMessage(anyString(), eq("Hello from Raji!"));
    }
}
