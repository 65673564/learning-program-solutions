package com.example;

public class LotteryService {

    private RandomNumberGenerator rng;

    public LotteryService(RandomNumberGenerator rng) {
        this.rng = rng;
    }

    public int[] drawTwoNumbers() {
        return new int[] { rng.generate(), rng.generate() };
    }
}
