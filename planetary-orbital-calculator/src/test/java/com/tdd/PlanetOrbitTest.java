package com.tdd;

import com.tdd.planet.EARTH;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlanetOrbitTest {

    @Test
    void 지구_궤도를_생성합니다() {
        PlanetOrbit actual = PlanetOrbit.of(EARTH.LONG_RADIUS,
                EARTH.ECCENTRICITY,
                EARTH.INCLINATION,
                EARTH.LONGITUDE_OF_ASCENDING_NODE,
                EARTH.AVERAGE_LONGITUDE,
                EARTH.PERIHELION_LONGITUDE,
                EARTH.AU,
                EARTH.CHANGE_PER_CENTURY);

        assertThat(actual).isInstanceOf(Orbit.class);
        assertThat(actual.getAu()).isEqualTo(EARTH.AU);
        assertThat(actual.getChangePerCentury()).isEqualTo(EARTH.CHANGE_PER_CENTURY);
    }
}