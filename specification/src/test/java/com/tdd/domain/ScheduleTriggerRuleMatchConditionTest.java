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

    @Test
    @DisplayName("is satisfied for multiple condition")
    void multiple_condition() {
        Map<String, Object> factor = Maps.newHashMap("name", "foo");
        AndCondition sut = new AndCondition(expected("name", "foo"),
                expected("age", "18"));

        assertThat(sut.isSatisfy(factor)).isFalse();

        factor.put("age", "18");
        assertThat(sut.isSatisfy(factor)).isTrue();
    }
}