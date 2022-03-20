package com.tdd.domain;

import java.util.Map;

public class ScheduleTriggerRuleMatchCondition {
    public static ScheduleTriggerRuleMatchCondition expected(String expectedKey, String expectedValue) {
        return new ScheduleTriggerRuleMatchCondition(expectedKey, expectedValue);
    }

    private final String expectedKey;
    private final String expectedValue;

    public ScheduleTriggerRuleMatchCondition(String expectedKey, String expectedValue) {
        this.expectedKey = expectedKey;
        this.expectedValue = expectedValue;
    }

    public boolean isSatisfy(Object object) {
        if (object instanceof Map) {
            Map<String, String> map = (Map<String, String>) object;
            return expectedValue.equals(map.get(expectedKey));
        }

        return false;
    }
}
