package com.tdd.domain;

import org.assertj.core.util.Maps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScheduleTriggerRuleMatchConditionTest {

    @Test
    @DisplayName("is satisfied because contain foo")
    void map_contain() {
        Object object1 = Maps.newHashMap("foo", "value");
        Object object2 = Maps.newHashMap("bar", "value");
        ScheduleTriggerRuleMatchCondition sut = new ScheduleTriggerRuleMatchCondition();

        assertThat(sut.isSatisfy(object1)).isTrue();
        assertThat(sut.isSatisfy(object2)).isTrue();
    }
}