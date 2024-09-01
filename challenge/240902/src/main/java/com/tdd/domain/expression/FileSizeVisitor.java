package com.tdd.domain.expression;

import com.tdd.domain.filesystem.FileNode;

public class FileSizeVisitor {
    public int visit(FileNode fileNode) {
        return fileNode.getSize();
    }
}
