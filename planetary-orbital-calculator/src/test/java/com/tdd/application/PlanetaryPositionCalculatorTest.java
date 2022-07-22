package com.tdd.application;

import com.tdd.domain.EclipticCoordinate;
import com.tdd.domain.PlanetOrbit;
import com.tdd.planet.EARTH;
import com.tdd.util.TimeFreezer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlanetaryPositionCalculatorTest {

    private static final LocalDateTime EPOCH_TIME = LocalDateTime.of(2000, 1, 1, 12, 0, 0);
    public static final double X_OF_EPOCH_TIME = 1.4694932560460544E11;
    public static final double Y_OF_EPOCH_TIME = -6.6734438045969925E9;
    public static final double TRUE_ANOMALY_OF_EPOCH_TIME = -2.600199987674757;
    public static final double EUCLIDEAN_DISTANCE_OF_EPOCH_TIME = 0.9833079767952526;

    PlanetOrbit PLANET = PlanetOrbit.of(EARTH.LONG_RADIUS,
            EARTH.ECCENTRICITY,
            EARTH.INCLINATION,
            EARTH.LONGITUDE_OF_ASCENDING_NODE,
            EARTH.AVERAGE_LONGITUDE,
            EARTH.PERIHELION_LONGITUDE,
            EARTH.AU,
            EARTH.CHANGE_PER_CENTURY);

    @AfterEach
    void tearDown() {
        TimeFreezer.rollback();
    }

    @Test
    void 역기점의_황도_좌표값() {
        TimeFreezer.freeze(EPOCH_TIME);

        EclipticCoordinate actual = PlanetaryPositionCalculator.calculateEclipticCoordinate(PLANET);

        assertThat(actual.getX()).isEqualTo(X_OF_EPOCH_TIME);
        assertThat(actual.getY()).isEqualTo(Y_OF_EPOCH_TIME);
    }

    @Test
    void 역기점의_진근점_이각을_계산한다() {
        TimeFreezer.freeze(EPOCH_TIME);

        double actual = PlanetaryPositionCalculator.calculateTrueAnomaly(PLANET);

        assertThat(actual).isEqualTo(TRUE_ANOMALY_OF_EPOCH_TIME);
    }

    @Test
    void 역기점의_유클리드_거리를_계산한다() {
        TimeFreezer.freeze(EPOCH_TIME);

        double actual = PlanetaryPositionCalculator.calculateEuclideanDistance(PLANET);

        assertThat(actual).isEqualTo(EUCLIDEAN_DISTANCE_OF_EPOCH_TIME);
    }

    @Test
    void 유클리드_거리_계산시_유효하지_않은_값이면_안된다() {
        assertThatThrownBy(() -> PlanetaryPositionCalculator.calculateEuclideanDistance(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 황도_좌표값_계산시_유효하지_않은_값이면_안된다() {
        assertThatThrownBy(() -> PlanetaryPositionCalculator.calculateEclipticCoordinate(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 진근점_이각_계산시_유효하지_않은_값이면_안된다() {
        assertThatThrownBy(() -> PlanetaryPositionCalculator.calculateTrueAnomaly(null)).isInstanceOf(IllegalArgumentException.class);
    }
}
