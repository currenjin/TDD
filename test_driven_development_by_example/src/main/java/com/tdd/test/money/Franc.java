package com.tdd.test.money;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multipler) {
        return new Money(amount * multipler, currency);
    }
}
