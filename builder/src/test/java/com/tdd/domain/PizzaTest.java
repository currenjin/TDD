package com.tdd.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {
    @Test
    void pizza() {
        Pizza smallPizza = new Pizza(4);
        Pizza largePizza = new Pizza(8);

        assertEquals(4, smallPizza.getSize());
        assertEquals(8, largePizza.getSize());
    }

    @Test
    void pizza_with_cheese() {
        Pizza pizza = new Pizza(4, true);
        assertEquals(true, pizza.getCheese());
    }

    @Test
    void pizza_without_cheese() {
        Pizza pizza = new Pizza(4, false);
        assertEquals(false, pizza.getCheese());
    }

    @Test
    void pizza_with_peperoni() {
        Pizza pizza = new Pizza(4, false, true);
        assertEquals(true, pizza.getPeperoni());
    }

    @Test
    void pizza_without_peperoni() {
        Pizza pizza = new Pizza(4, false, false);
        assertEquals(false, pizza.getPeperoni());
    }
}
