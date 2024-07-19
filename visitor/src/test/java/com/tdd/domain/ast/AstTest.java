package com.tdd.domain.ast;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AstTest {
    PrintVisitor visitor = new PrintVisitor();

    @Test
    void name() {
        VariableNode node = new VariableNode();

        node.accept(visitor);

        assertEquals(1, visitor.getNames().size());
    }
}
