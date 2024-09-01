package com.tdd.domain.filesystem;

public class FileNode {
    private final int size;
    private final String name;

    public FileNode(String name, int size) {
        validate(name);

        this.name = name;
        this.size = size;
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }
}
