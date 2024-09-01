package com.tdd.domain.filesystem;

import com.tdd.domain.expression.FileSizeVisitor;

public interface FileSystemNode {
    int accept(FileSizeVisitor visitor);
}
