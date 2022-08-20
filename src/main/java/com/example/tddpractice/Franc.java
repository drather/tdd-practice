package com.example.tddpractice;

import java.util.Objects;

public class Franc extends Money {
    private String currency;

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

}
