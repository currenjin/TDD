package com.tdd.domain.expression;

import com.tdd.domain.filesystem.DirectoryNode;
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

    @Test
    void directory_size_accept_test() {
        DirectoryNode directoryNode = new DirectoryNode("directory");
        FileNode firstNode = new FileNode("first", 1);
        FileNode secondNode = new FileNode("second", 2);

        directoryNode.add(firstNode);
        directoryNode.add(secondNode);

        int size = directoryNode.accept(visitor);

        assertEquals(3, size);
    }

    @Test
    void directory_has_both_directory() {
        FileNode firstNode = new FileNode("first", 1);
        FileNode secondNode = new FileNode("second", 2);

        DirectoryNode firstDirectory = new DirectoryNode("firstDirectory");
        firstDirectory.add(firstNode);
        firstDirectory.add(secondNode);

        DirectoryNode secondDirectory = new DirectoryNode("secondDirectory");
        secondDirectory.add(firstNode);
        secondDirectory.add(secondNode);

        DirectoryNode thirdDirectory = new DirectoryNode("thirdDirectory");
        thirdDirectory.add(firstNode);
        thirdDirectory.add(secondNode);

        DirectoryNode rootDirectory = new DirectoryNode("root");
        rootDirectory.add(firstDirectory);
        rootDirectory.add(secondDirectory);
        rootDirectory.add(thirdDirectory);

        int size = rootDirectory.accept(visitor);

        assertEquals(9, size);
    }
}