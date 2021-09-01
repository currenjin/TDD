package com.tdd.test.money;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multipler) {
        return Money.franc(amount * multipler);
    }
}
