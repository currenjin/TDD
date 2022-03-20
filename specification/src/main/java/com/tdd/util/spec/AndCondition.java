package com.tdd.util.spec;

import com.tdd.domain.ScheduleTriggerRuleMatchCondition;

public class AndCondition implements ScheduleTriggerRuleMatchCondition {

    private final ScheduleTriggerRuleMatchCondition left;
    private final ScheduleTriggerRuleMatchCondition right;

    public AndCondition(ScheduleTriggerRuleMatchCondition left, ScheduleTriggerRuleMatchCondition right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfy(Object object) {
        return this.left.isSatisfy(object) && this.right.isSatisfy(object);
    }
}
