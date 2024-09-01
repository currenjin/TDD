package com.tdd.domain.filesystem;

import com.tdd.domain.expression.FileSizeVisitor;

import java.util.ArrayList;
import java.util.List;

public class DirectoryNode implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public DirectoryNode(String name) {
        StringValidator.validate(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<FileSystemNode> getChildren() {
        return this.children;
    }

    public void add(FileSystemNode node) {
        this.children.add(node);
    }

    @Override
    public int accept(FileSizeVisitor visitor) {
        return visitor.visit(this);
    }
}
