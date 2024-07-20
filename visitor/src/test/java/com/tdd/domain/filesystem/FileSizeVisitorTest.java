package com.tdd.domain.filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileSizeVisitorTest {
    FileSizeVisitor visitor = new FileSizeVisitor();

    @Test
    void file_accept() {
        FileNode firstFile = new FileNode("file", 1);
        FileNode secondFile = new FileNode("file", 2);

        int firstSize = firstFile.accept(visitor);
        int secondSize = secondFile.accept(visitor);

        assertEquals(1, firstSize);
        assertEquals(2, secondSize);
    }

    @Test
    void directory_accept() {
        FileNode firstFile = new FileNode("file", 1);
        FileNode secondFile = new FileNode("file", 2);
        DirectoryNode directory = new DirectoryNode("directory");
        directory.addChildren(firstFile);
        directory.addChildren(secondFile);

        int totalSize = directory.accept(visitor);

        assertEquals(3, totalSize);
    }
}
