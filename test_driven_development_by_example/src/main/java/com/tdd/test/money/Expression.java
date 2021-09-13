package com.tdd.test.money;

public interface Expression {
    Money reduce(Bank bank, String to);
}
