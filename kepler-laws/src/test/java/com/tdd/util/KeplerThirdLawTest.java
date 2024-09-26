package com.tdd.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeplerThirdLawTest {

    public static final double DELTA = 0.01;

    @Test
    void testOrbitalPeriodEarth() {
        double semiMajorAxis = 1.0;
        double expectedPeriod = 1.0;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, expectedPeriod);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

    @Test
    public void testCalculateOrbitalPeriodMars() {
        double semiMajorAxis = 1.52;
        double centralMass = 1.0;
        double expectedPeriod = 1.88;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, centralMass);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }
}