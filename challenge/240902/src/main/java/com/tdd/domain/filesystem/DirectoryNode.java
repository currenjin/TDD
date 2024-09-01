package com.tdd.domain.filesystem;

public class DirectoryNode {
    private final String name;

    public DirectoryNode(String name) {
        StringValidator.validate(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
