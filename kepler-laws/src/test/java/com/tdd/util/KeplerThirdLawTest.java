package com.tdd.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class KeplerThirdLawTest {

    public static final double DELTA = 0.01;
    public static final double CENTRAL_MASS = 1.0;

    @Test
    public void testCalculateOrbitalPeriodMercury() {
        double semiMajorAxis = 0.39;
        double expectedPeriod = 0.24;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, CENTRAL_MASS);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

    @Test
    public void testCalculateOrbitalPeriodVenus() {
        double semiMajorAxis = 0.72;
        double expectedPeriod = 0.62;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, CENTRAL_MASS);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

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
        double expectedPeriod = 1.88;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, CENTRAL_MASS);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

    @Test
    public void testCalculateOrbitalPeriodJupiter() {
        double semiMajorAxis = 5.20;
        double expectedPeriod = 11.86;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, CENTRAL_MASS);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

    @Test
    public void testCalculateOrbitalPeriodSaturn() {
        double semiMajorAxis = 9.54;
        double expectedPeriod = 29.46;

        double actualPeriod = KeplerThirdLaw.calculateOrbitalPeriod(semiMajorAxis, CENTRAL_MASS);

        assertEquals(expectedPeriod, actualPeriod, DELTA);
    }

    @Test
    public void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> KeplerThirdLaw.calculateOrbitalPeriod(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> KeplerThirdLaw.calculateOrbitalPeriod(1, -1));
        assertThrows(IllegalArgumentException.class, () -> KeplerThirdLaw.calculateOrbitalPeriod(0, 1));
        assertThrows(IllegalArgumentException.class, () -> KeplerThirdLaw.calculateOrbitalPeriod(1, 0));
    }
}