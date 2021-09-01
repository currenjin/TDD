package com.tdd.test.money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multipler) {
        return new Franc(amount * multipler);
    }
}
