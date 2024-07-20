package com.tdd.domain.filesystem;

public class FileSizeVisitor {
    public int visit(FileNode node) {
        return node.getSize();
    }
}
