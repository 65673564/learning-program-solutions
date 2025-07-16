package com.example;

public class Bank {

    public void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        // perform withdrawal logic (not needed for this test)
    }
}
