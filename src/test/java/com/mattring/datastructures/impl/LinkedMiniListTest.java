package com.mattring.datastructures.impl;

import com.mattring.datastructures.MiniListTest;
import org.junit.jupiter.api.Test;

class LinkedMiniListTest extends MiniListTest {
    @Test
    public void testAddIterateHappyPath() {
        super.testAddIterateHappyPath(new LinkedMiniList<>());
    }

    @Test
    public void testIterateEmptyHasNoneAndDoesNotThrow() {
        super.testIterateEmptyHasNoneAndDoesNotThrow(new LinkedMiniList<>());
    }
}