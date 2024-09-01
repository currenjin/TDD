package com.tdd.domain.filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DirectoryNodeTest {
    @Test
    void directory_name_test() {
        DirectoryNode firstDirectory = new DirectoryNode("first");
        DirectoryNode secondDirectory = new DirectoryNode("second");

        assertEquals("first", firstDirectory.getName());
        assertEquals("second", secondDirectory.getName());
    }

    @Test
    void directory_name_cannot_be_null_or_empty_blank() {
        assertThrows(IllegalArgumentException.class, () -> new DirectoryNode(null));
        assertThrows(IllegalArgumentException.class, () -> new DirectoryNode(""));
        assertThrows(IllegalArgumentException.class, () -> new DirectoryNode(" "));
    }
}
