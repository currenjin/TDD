package com.tdd.domain.filesystem;

public interface FileSystemVisitor {
    int visit(FileNode node);
}
