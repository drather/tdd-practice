package com.example.tddpractice;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        amount *= multiplier;
        return new Dollar(amount * multiplier);
    }
}
