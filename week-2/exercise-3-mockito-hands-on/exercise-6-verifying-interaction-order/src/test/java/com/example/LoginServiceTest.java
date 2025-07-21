package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

class LoginServiceTest {

    @Test
    void testLoginMethodCallOrder() {
        Logger mockLogger = mock(Logger.class);
        LoginService loginService = new LoginService(mockLogger);

        loginService.login("raji");

        // Verify order
        InOrder inOrder = inOrder(mockLogger);
        inOrder.verify(mockLogger).start();
        inOrder.verify(mockLogger).log("User raji logging in");
        inOrder.verify(mockLogger).end();
    }
}
