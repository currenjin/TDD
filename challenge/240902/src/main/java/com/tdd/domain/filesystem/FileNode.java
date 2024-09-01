package com.tdd.domain.filesystem;

import com.tdd.domain.expression.FileSizeVisitor;

public class FileNode implements FileSystemNode {
    private final int size;
    private final String name;

    public FileNode(String name, int size) {
        StringValidator.validate(name);

        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public int accept(FileSizeVisitor visitor) {
        return visitor.visit(this);
    }
}
