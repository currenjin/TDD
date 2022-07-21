package com.tdd.application;

import com.tdd.domain.Orbit;
import com.tdd.domain.PlanetOrbit;
import com.tdd.util.JulianClock;

public class CurrentOrbitCalculator {

    public static Orbit of(PlanetOrbit planetOrbit) {
        double elapsedCentury = JulianClock.elapsedCentury();

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
