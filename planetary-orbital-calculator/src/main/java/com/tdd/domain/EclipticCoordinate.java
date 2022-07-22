package com.tdd.domain;

public class EclipticCoordinate {
    private final double x;
    private final double y;

    public EclipticCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
