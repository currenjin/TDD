package com.challenge.tdd;

public interface Expression {
    Money reduce(Bank bank, String to);
}
