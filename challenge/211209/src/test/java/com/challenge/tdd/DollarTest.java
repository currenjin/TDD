package com.challenge.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DollarTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);

        assertThat(five.times(2)).isEqualTo(new Dollar(10));
        assertThat(five.times(3)).isEqualTo(new Dollar(15));
    }

    @Test
    void testEquality() {
        assertThat(new Dollar(5).equals(new Dollar(5))).isTrue();
        assertThat(new Dollar(5).equals(new Dollar(6))).isFalse();
    }
}