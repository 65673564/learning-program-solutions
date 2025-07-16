package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    @Test
    void testGreet() {
        Welcome w = new Welcome();
        assertEquals("Welcome, Raji!", w.greet("Raji"));
    }
}
