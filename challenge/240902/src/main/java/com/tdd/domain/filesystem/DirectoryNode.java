package com.tdd.domain.filesystem;

import java.util.ArrayList;
import java.util.List;

public class DirectoryNode {
    private final String name;
    private List<FileNode> children = new ArrayList<>();

    public DirectoryNode(String name) {
        StringValidator.validate(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<FileNode> getChildren() {
        return this.children;
    }

    public void add(FileNode node) {
        this.children.add(node);
    }
}
