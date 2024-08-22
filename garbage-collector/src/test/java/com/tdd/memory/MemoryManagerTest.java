package com.tdd.memory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MemoryManagerTest {
    @Test
    void testMemoryAllocation() {
        MemoryManager memoryManager = new MemoryManager();
        Object obj = memoryManager.allocate();
        assertNotNull(obj);
    }
}
