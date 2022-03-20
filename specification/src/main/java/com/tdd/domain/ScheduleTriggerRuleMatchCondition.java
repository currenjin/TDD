package com.tdd.domain;

import java.util.Map;

public class ScheduleTriggerRuleMatchCondition {
    public boolean isSatisfy(Object object) {
        if (object instanceof Map) {
            Map<String, String> map = (Map<String, String>) object;
            return map.containsKey("foo") || map.containsKey("bar");
        }

        return false;
    }
}
