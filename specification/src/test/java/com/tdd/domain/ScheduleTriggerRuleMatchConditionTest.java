package com.tdd.domain;

import org.assertj.core.util.Maps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.tdd.domain.ScheduleTriggerRuleMatchCondition.*;
import static org.assertj.core.api.Assertions.assertThat;

class ScheduleTriggerRuleMatchConditionTest {

    @Test
    @DisplayName("is satisfied because contain key and value")
    void map_contain() {
        Map<String, String> map = Maps.newHashMap("jar", "foo");

        assertThat(expected("jar", "xxxxx").isSatisfy(map)).isFalse();
        assertThat(expected("jar", "foo").isSatisfy(map)).isTrue();
    }

    public static class ABC {
        public boolean isSatisfy(Map<String, Object> factor) {
            return expected("name", "foo").isSatisfy(factor)
                    && expected("age", "18").isSatisfy(factor);
        }
    }

    @Test
    @DisplayName("is satisfied for multiple condition")
    void multiple_condition() {
        Map<String, Object> map = Maps.newHashMap("name", "foo");
        map.put("age", "18");

        assertThat(new ABC().isSatisfy(map)).isTrue();
    }
}