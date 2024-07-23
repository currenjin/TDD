package com.tdd.domain;

public class PizzaBuilder {
    private PizzaSize size;

    public PizzaBuilder size(PizzaSize size) {
        this.size = size;
        return this;
    }

    public Pizza build() {
        return new Pizza(size);
    }
}
