package com.tdd;

import com.tdd.utils.JulianClock;

public class CurrentOrbitCalculator {

    public static Orbit of(PlanetOrbit planetOrbit) {
        JulianClock julianClock = new JulianClock();
        double elapsedCentury = julianClock.elapsedCentury();

        double longRadius = planetOrbit.getLongRadius() + (planetOrbit.getChangePerCentury().getLongRadius() * elapsedCentury);
        double eccentricity = planetOrbit.getEccentricity() + (planetOrbit.getChangePerCentury().getEccentricity() * elapsedCentury);
        double inclination = planetOrbit.getInclination() + (planetOrbit.getChangePerCentury().getInclination() * elapsedCentury);
        double longitudeOfAscendingNode = planetOrbit.getLongitudeOfAscendingNode() + (planetOrbit.getChangePerCentury().getLongitudeOfAscendingNode() * elapsedCentury);
        double averageLongitude = planetOrbit.getAverageLongitude() + (planetOrbit.getChangePerCentury().getAverageLongitude() * elapsedCentury);
        double perihelionLongitude = planetOrbit.getPerihelionLongitude() + (planetOrbit.getChangePerCentury().getPerihelionLongitude() * elapsedCentury);

        return Orbit.of(longRadius,
                eccentricity,
                inclination,
                longitudeOfAscendingNode,
                averageLongitude,
                perihelionLongitude);
    }
}
