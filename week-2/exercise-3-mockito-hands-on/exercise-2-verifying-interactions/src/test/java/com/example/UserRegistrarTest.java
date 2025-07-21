package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class UserRegistrarTest {

    @Test
    void testVerifySendEmailCalledOnce() {
        NotificationService mockNotification = mock(NotificationService.class);
        UserRegistrar registrar = new UserRegistrar(mockNotification);

        registrar.register("raji@example.com");

        verify(mockNotification).sendEmail("raji@example.com"); // Must be called once
        verify(mockNotification, times(1)).sendEmail("raji@example.com"); // Explicit one time
        verify(mockNotification, never()).sendEmail("other@example.com"); // Never called
    }
}
