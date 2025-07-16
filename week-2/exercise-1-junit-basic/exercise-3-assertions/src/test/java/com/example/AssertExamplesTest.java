package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssertExamplesTest {

    AssertExamples ex = new AssertExamples();

    @Test
    void testSayHello() {
        assertEquals("Hello, Raji!", ex.sayHello());
    }

    @Test
    void testArray() {
        assertArrayEquals(new int[]{85, 90, 95}, ex.getMarks());
    }

    @Test
    void testBoolean() {
        assertTrue(ex.isEven(10));
        assertFalse(ex.isEven(7));
    }

    @Test
    void testNull() {
        assertNull(ex.getNullValue());
    }
}
