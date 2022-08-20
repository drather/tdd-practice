package com.example.tddpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurrencyTest {
    @Test
    public void testCurrency() {
        Money res = Money.franc(1);
        String currency = res.currency();

        assertEquals("CHF", currency);
        assertEquals("USD", Money.dollar(1).currency());
    }


}
