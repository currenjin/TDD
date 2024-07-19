package com.tdd.domain.ast;

public class VariableNode {
    private String name;

    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
