package com.tdd.domain.expression;

public class MultiplicationExpression implements Expression {
    private Expression left;
    private Expression right;

    @Override
    public int accept(ExpressionVisitor visitor) {
        return visitor.visit(this);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
