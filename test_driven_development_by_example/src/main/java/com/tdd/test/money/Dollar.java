package com.tdd.test.money;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multipler) {
        return new Dollar(amount * multipler);
    }

    public boolean equals(Dollar dollar) {
        return amount == dollar.amount;
    }
}
