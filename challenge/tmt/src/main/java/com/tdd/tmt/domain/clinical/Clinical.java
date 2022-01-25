package com.tdd.tmt.domain.clinical;

public class Clinical {

    public boolean condition(int age, boolean agreed) {
        if (age >= 19 && age <= 55 && agreed) return true;

        return false;
    }
}
