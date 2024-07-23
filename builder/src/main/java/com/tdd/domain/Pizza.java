package com.tdd.domain;

public class Pizza {
    private final int size;
    private final boolean cheese;
    private final boolean peperoni;

    public Pizza(int size) {
        this.size = size;
        this.cheese = false;
        this.peperoni = false;
    }

    public Pizza(int size, boolean cheese) {
        this.size = size;
        this.cheese = cheese;
        this.peperoni = false;
    }

    public Pizza(int size, boolean cheese, boolean peperoni) {
        this.size = size;
        this.cheese = cheese;
        this.peperoni = peperoni;
    }

    public int getSize() {
        return this.size;
    }

    public boolean getCheese() {
        return this.cheese;
    }

    public boolean getPeperoni() {
        return this.peperoni;
    }
}
