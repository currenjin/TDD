package com.tdd.domain.filesystem;

public class FileSizeVisitor implements FileSystemVisitor {
    @Override
    public int visit(FileNode node) {
        return node.getSize();
    }
}
