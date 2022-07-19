package com.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TrueAnomalyCalculatorTest {

    public static final Double AVERAGE_LONGITUDE = 100.46457166;
    public static final Double PERIHELION_LONGITUDE = 102.93768193;

    @Test
    void 평균근점이각은_평균_경도에서_근일점_경도를_뺀_값이다() {
        double actual = TrueAnomalyCalculator.calculateMeanAnomaly(AVERAGE_LONGITUDE, PERIHELION_LONGITUDE);

        assertThat(actual).isEqualTo(AVERAGE_LONGITUDE - PERIHELION_LONGITUDE);
    }

    @Test
    void 평균근점이각_계산시_평균_경도가_유효하지_않으면_안된다() {
        assertThatThrownBy(() ->
                TrueAnomalyCalculator.calculateMeanAnomaly(null, PERIHELION_LONGITUDE))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 평균근점이각_계산시_근일점_경도가_유효하지_않으면_안된다() {
        assertThatThrownBy(() ->
                TrueAnomalyCalculator.calculateMeanAnomaly(AVERAGE_LONGITUDE, null))
                .isInstanceOf(IllegalArgumentException.class);
    }
}