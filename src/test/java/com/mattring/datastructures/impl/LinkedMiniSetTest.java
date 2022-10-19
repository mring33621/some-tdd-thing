package com.mattring.datastructures.impl;

import com.mattring.datastructures.MiniSetTest;
import org.junit.jupiter.api.Test;

class LinkedMiniSetTest extends MiniSetTest {
    @Test
    public void testAddIterateHappyPath() {
        super.testAddIterateHappyPath(new LinkedMiniSet<>());
    }

    @Test
    public void testIterateEmptyHasNoneAndDoesNotThrow() {
        super.testIterateEmptyHasNoneAndDoesNotThrow(new LinkedMiniSet<>());
    }
}