package com.tdd.domain;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ScheduleTriggerRuleMatchPolicy {
    private final ScheduleTriggerRuleMatchCondition condition;
    private final ScheduleTriggerRule rule;

    public Optional<ScheduleGroup> createScheduleGroup(Object object) {
        if (condition.isSatisfy(object)) {
            return Optional.of(new ScheduleGroup());
        }

        return Optional.empty();
    }
}
