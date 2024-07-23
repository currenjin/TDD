package com.tdd.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaBuilderTest {
    @Test
    void build_pizza_with_size() {
        PizzaBuilder builder = new PizzaBuilder();

        Pizza pizza = builder.size(PizzaSize.SMALL).build();

        assertEquals(PizzaSize.SMALL, pizza.getSize());
    }
}
