package com.tdd.application;

import com.tdd.domain.Orbit;
import com.tdd.domain.PlanetOrbit;
import com.tdd.util.JulianClock;

public class CurrentOrbitCalculator {

    public static Orbit of(PlanetOrbit planetOrbit) {
        double longRadius = getCurrentOrbitElement(planetOrbit.getLongRadius(), planetOrbit.getChangePerCentury().getLongRadius());
        double eccentricity = getCurrentOrbitElement(planetOrbit.getEccentricity(), planetOrbit.getChangePerCentury().getEccentricity());
        double inclination = getCurrentOrbitElement(planetOrbit.getInclination(), planetOrbit.getChangePerCentury().getInclination());
        double longitudeOfAscendingNode = getCurrentOrbitElement(planetOrbit.getLongitudeOfAscendingNode(), planetOrbit.getChangePerCentury().getLongitudeOfAscendingNode());
        double averageLongitude = getCurrentOrbitElement(planetOrbit.getAverageLongitude(), planetOrbit.getChangePerCentury().getAverageLongitude());
        double perihelionLongitude = getCurrentOrbitElement(planetOrbit.getPerihelionLongitude(), planetOrbit.getChangePerCentury().getPerihelionLongitude());

        return Orbit.of(longRadius,
                eccentricity,
                inclination,
                longitudeOfAscendingNode,
                averageLongitude,
                perihelionLongitude);
    }

    private static double getCurrentOrbitElement(Double element, Double changePerCenturyByElement) {
        double elapsedCentury = JulianClock.elapsedCentury();

        return element + (changePerCenturyByElement * elapsedCentury);
    }
}
