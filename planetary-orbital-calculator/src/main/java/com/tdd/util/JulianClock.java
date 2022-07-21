package com.tdd.util;

import static java.time.ZoneOffset.UTC;

public class JulianClock {

    public long elapsedDate() {
        return getEpochTime() / TimeConstant.DAY;
    }

    public double elapsedCentury() {
        return elapsedDate() / TimeConstant.CENTURY;
    }

    private long getEpochTime() {
        return Clocks.now().toEpochSecond(UTC) - TimeConstant.J2000.toEpochSecond(UTC);
    }
}
