package com.tdd.domain.filesystem;

public class FileNode {
    private final int size;
    private final String name;

    public FileNode(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }
}
