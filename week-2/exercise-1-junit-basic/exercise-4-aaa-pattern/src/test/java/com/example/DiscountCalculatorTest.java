package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    void testApplyDiscount_AAA() {
        // Arrange
        DiscountCalculator calc = new DiscountCalculator();
        double originalPrice = 100.0;
        double discount = 20.0;

        // Act
        double finalPrice = calc.applyDiscount(originalPrice, discount);

        // Assert
        assertEquals(80.0, finalPrice);
    }
}
