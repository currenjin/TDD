package com.tdd.application;

import com.tdd.domain.EclipticCoordinate;
import com.tdd.domain.Orbit;
import com.tdd.domain.PlanetOrbit;
import com.tdd.domain.PlanetaryPosition;

public class PlanetaryPositionCalculator {

    public static PlanetaryPosition position(PlanetOrbit planet) {

        double euclideanDistance = calculateEuclideanDistance(planet);
        double trueAnomaly = calculateTrueAnomaly(planet);

        return PlanetaryPosition.of(euclideanDistance, trueAnomaly);
    }

    public static double calculateTrueAnomaly(PlanetOrbit planet) {

        validatePlanetOrbit(planet);

        EclipticCoordinate eclipticCoordinate = calculateEclipticCoordinate(planet);

        return Math.atan2(eclipticCoordinate.getY(), eclipticCoordinate.getX()) * (180 / Math.PI);
    }

    public static double calculateEuclideanDistance(PlanetOrbit planet) {

        validatePlanetOrbit(planet);

        EclipticCoordinate eclipticCoordinate = calculateEclipticCoordinate(planet);

        return Math.sqrt(Math.pow(eclipticCoordinate.getX(), 2) + Math.pow(eclipticCoordinate.getY(), 2)) / (1000 * planet.getAu());
    }

    public static EclipticCoordinate calculateEclipticCoordinate(PlanetOrbit planet) {

        validatePlanetOrbit(planet);

        Orbit currentOrbit = CurrentOrbitCalculator.of(planet);
        double eccentricityAnomaly = EccentricityAnomalyCalculator.calculate(currentOrbit.getEccentricity(), currentOrbit.getAverageLongitude(), currentOrbit.getPerihelionLongitude());

        double x = (planet.getLongRadius() * 1000) * (Math.cos(eccentricityAnomaly) - currentOrbit.getEccentricity());
        double y = (planet.getLongRadius() * 1000) * (Math.sqrt(1 - (currentOrbit.getEccentricity() * currentOrbit.getEccentricity()))) * Math.sin(eccentricityAnomaly);

        return new EclipticCoordinate(x, y);
    }

    private static void validatePlanetOrbit(PlanetOrbit planet) {
        if (planet == null) {
            throw new IllegalArgumentException();
        }
    }
}
