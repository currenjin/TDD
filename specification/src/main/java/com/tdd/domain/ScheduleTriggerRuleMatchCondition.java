package com.tdd.domain;

public interface ScheduleTriggerRuleMatchCondition {
    public static ScheduleTriggerRuleMatchCondition expected(String expectedKey, String expectedValue) {
        return new MapCondition(expectedKey, expectedValue);
    }

    public boolean isSatisfy(Object object);
}
