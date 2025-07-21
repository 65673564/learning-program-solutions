package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserManagerTest {

    @Test
    void testRegisterUser_WithMockedEmailService() {
        // Mock
        EmailService mockEmailService = mock(EmailService.class);

        // Stub
        when(mockEmailService.sendWelcomeEmail("raji")).thenReturn("Welcome Raji!");

        // Inject mock into system under test
        UserManager manager = new UserManager(mockEmailService);

        // Assert
        String result = manager.registerUser("raji");
        assertEquals("Welcome Raji!", result);

        // Verify interaction
        verify(mockEmailService).sendWelcomeEmail("raji");
    }
}
