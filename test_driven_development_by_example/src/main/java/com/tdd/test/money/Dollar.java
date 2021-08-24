package com.tdd.test.money;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multipler) {
        amount *= multipler;
    }
}
