package com.tdd.domain.expression;

public class NumberExpression implements Expression {
    private int value;

    @Override
    public int accept(ExpressionVisitor visitor) {
        return visitor.visit(this);
    }

    public int getValue() {
        return value;
    }
}
