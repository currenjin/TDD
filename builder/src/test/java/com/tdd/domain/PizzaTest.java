package com.tdd.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {
    @Test
    void pizza() {
        Pizza smallPizza = new Pizza(PizzaSize.SMALL);
        Pizza largePizza = new Pizza(PizzaSize.LARGE);

        assertEquals(PizzaSize.SMALL, smallPizza.getSize());
        assertEquals(PizzaSize.LARGE, largePizza.getSize());
    }

    @Test
    void pizza_with_cheese() {
        Pizza pizza = new Pizza(PizzaSize.SMALL, true);
        assertEquals(true, pizza.getCheese());
    }

    @Test
    void pizza_without_cheese() {
        Pizza pizza = new Pizza(PizzaSize.SMALL, false);
        assertEquals(false, pizza.getCheese());
    }

    @Test
    void pizza_with_peperoni() {
        Pizza pizza = new Pizza(PizzaSize.SMALL, false, true);
        assertEquals(true, pizza.getPeperoni());
    }

    @Test
    void pizza_without_peperoni() {
        Pizza pizza = new Pizza(PizzaSize.SMALL, false, false);
        assertEquals(false, pizza.getPeperoni());
    }
}
