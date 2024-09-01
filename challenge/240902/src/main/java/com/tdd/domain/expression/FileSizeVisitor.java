package com.tdd.domain.expression;

import com.tdd.domain.filesystem.DirectoryNode;
import com.tdd.domain.filesystem.FileNode;

public class FileSizeVisitor {
    public int visit(FileNode fileNode) {
        return fileNode.getSize();
    }

    public int visit(DirectoryNode directoryNode) {
        return directoryNode.getChildren()
                .stream()
                .mapToInt(child -> child.accept(this))
                .sum();
    }
}
