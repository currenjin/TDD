package com.tdd.test.money;

public class Money {
    protected int amount;

    public boolean equals(Money money) {
        return amount == money.amount;
    }
}
