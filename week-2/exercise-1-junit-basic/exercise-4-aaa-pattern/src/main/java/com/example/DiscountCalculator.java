package com.example;

public class DiscountCalculator {

    public double applyDiscount(double price, double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Invalid discount");
        }
        return price - (price * discountPercentage / 100);
    }
}
