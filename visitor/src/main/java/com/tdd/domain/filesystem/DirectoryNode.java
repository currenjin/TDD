package com.tdd.domain.filesystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DirectoryNode {
    private final String name;
    private final List<FileNode> children = new ArrayList<>();

    public DirectoryNode(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<FileNode> getChildren() {
        return this.children;
    }

    public void addChildren(FileNode file) {
        this.children.add(file);
    }
}
