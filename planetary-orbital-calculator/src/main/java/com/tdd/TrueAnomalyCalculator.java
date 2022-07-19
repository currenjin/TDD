package com.tdd;

public class TrueAnomalyCalculator {

    public static double calculateMeanAnomaly(Double averageLongitude, Double perihelionLongitude) {
        validateMeanAnomalyCalculator(averageLongitude, perihelionLongitude);

        return averageLongitude - perihelionLongitude;
    }

    private static void validateMeanAnomalyCalculator(Double averageLongitude, Double perihelionLongitude) {
        if (averageLongitude == null) {
            throw new IllegalArgumentException();
        }

        if (perihelionLongitude == null) {
            throw new IllegalArgumentException();
        }
    }
}
