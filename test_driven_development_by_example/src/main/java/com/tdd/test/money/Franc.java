package com.tdd.test.money;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multipler) {
        return new Franc(amount * multipler);
    }

    public boolean equals(Franc franc) {
        return amount == franc.amount;
    }
}
