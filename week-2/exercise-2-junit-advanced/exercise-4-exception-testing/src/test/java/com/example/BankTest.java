package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();

    @Test
    void testWithdrawException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(500.0, 600.0);
        });

        assertEquals("Insufficient balance", exception.getMessage());
    }
}
