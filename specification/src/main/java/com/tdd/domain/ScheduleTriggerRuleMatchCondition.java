package com.tdd.domain;

import com.tdd.util.spec.MapCondition;

public interface ScheduleTriggerRuleMatchCondition {
    static ScheduleTriggerRuleMatchCondition expected(String expectedKey, String expectedValue) {
        return new MapCondition(expectedKey, expectedValue);
    }

    boolean isSatisfy(Object object);
}
