package com.tdd.test.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTests {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertTrue(new Dollar(10).equals(five.times(2)));
        assertTrue(new Dollar(15).equals(five.times(3)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertTrue(new Franc(10).equals(five.times(2)));
        assertTrue(new Franc(15).equals(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
