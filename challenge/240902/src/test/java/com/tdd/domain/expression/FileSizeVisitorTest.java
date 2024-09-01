package com.tdd.domain.expression;

import com.tdd.domain.filesystem.FileNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileSizeVisitorTest {
    FileSizeVisitor visitor = new FileSizeVisitor();

    @Test
    void file_size_accept_test() {
        FileNode firstNode = new FileNode("first", 1);
        FileNode secondNode = new FileNode("second", 2);

        int firstSize = firstNode.accept(visitor);
        int secondSize = secondNode.accept(visitor);

        assertEquals(1, firstSize);
        assertEquals(2, secondSize);
    }
}