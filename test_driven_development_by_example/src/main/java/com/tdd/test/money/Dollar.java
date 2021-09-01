package com.tdd.test.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multipler) {
        return new Dollar(amount * multipler);
    }
}
