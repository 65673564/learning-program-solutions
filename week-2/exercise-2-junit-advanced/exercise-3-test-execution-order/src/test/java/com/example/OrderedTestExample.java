package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTestExample {

    @Test
    @Order(3)
    void testThird() {
        System.out.println("3️⃣ Third Test Executed");
        assertTrue(true);
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("1️⃣ First Test Executed");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("2️⃣ Second Test Executed");
        assertTrue(true);
    }
}
