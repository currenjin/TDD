package com.tdd.domain.ast;

import java.util.ArrayList;
import java.util.List;

public class PrintVisitor {
    private List<String> names = new ArrayList<>();

    public void visit(VariableNode node) {
        names.add(node.getName());
    }

    public List<String> getNames() {
        return names;
    }
}
