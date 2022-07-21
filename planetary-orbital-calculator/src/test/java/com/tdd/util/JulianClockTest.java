package com.tdd.util;

import org.junit.jupiter.api.Test;

import static com.tdd.util.TimeConstant.J2000;
import static org.assertj.core.api.Assertions.assertThat;

class JulianClockTest {

    JulianClock sut = new JulianClock();

    @Test
    void 역기점으로부터_하루가_지났다() {
        TimeFreezer.freeze(J2000.plusDays(1));

        assertThat(sut.elapsedDate()).isEqualTo(1);
    }

    @Test
    void 역기점으로부터_하루_전이다() {
        TimeFreezer.freeze(J2000.minusDays(1));

        assertThat(sut.elapsedDate()).isEqualTo(-1);
    }

    @Test
    void 역기점_당일이다() {
        TimeFreezer.freeze(J2000);

        assertThat(sut.elapsedDate()).isEqualTo(0);
    }

    @Test
    void 역기점으로부터_1세기가_지났다() {
        TimeFreezer.freeze(J2000.plusYears(100));

        assertThat(sut.elapsedCentury()).isBetween(0.999, 1.0);
    }

    @Test
    void 역기점으로부터_1세기_전이다() {
        TimeFreezer.freeze(J2000.minusYears(100));

        assertThat(sut.elapsedCentury()).isBetween(-1.0, -0.999);
    }

    @Test
    void 역기점으로부터_10세기_전이다() {
        TimeFreezer.freeze(J2000.minusYears(1000));


        assertThat(sut.elapsedCentury()).isBetween(-10.0, -9.999);
    }

    @Test
    void 역기점으로부터_20세기_후이다() {
        TimeFreezer.freeze(J2000.plusYears(2000));

        assertThat(sut.elapsedCentury()).isBetween(19.999, 20.0);
    }
}