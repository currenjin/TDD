package com.tdd.test.money;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
