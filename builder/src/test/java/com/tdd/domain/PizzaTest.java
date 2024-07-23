package com.tdd.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    public static final int SMALL_SIZE = 4;
    public static final int LARGE_SIZE = 8;

    @Test
    void pizza() {
        Pizza smallPizza = new Pizza(SMALL_SIZE);
        Pizza largePizza = new Pizza(LARGE_SIZE);

        assertEquals(SMALL_SIZE, smallPizza.getSize());
        assertEquals(LARGE_SIZE, largePizza.getSize());
    }

    @Test
    void pizza_with_cheese() {
        Pizza pizza = new Pizza(SMALL_SIZE, true);
        assertEquals(true, pizza.getCheese());
    }

    @Test
    void pizza_without_cheese() {
        Pizza pizza = new Pizza(SMALL_SIZE, false);
        assertEquals(false, pizza.getCheese());
    }

    @Test
    void pizza_with_peperoni() {
        Pizza pizza = new Pizza(SMALL_SIZE, false, true);
        assertEquals(true, pizza.getPeperoni());
    }

    @Test
    void pizza_without_peperoni() {
        Pizza pizza = new Pizza(SMALL_SIZE, false, false);
        assertEquals(false, pizza.getPeperoni());
    }
}
