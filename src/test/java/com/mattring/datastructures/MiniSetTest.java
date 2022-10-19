package com.mattring.datastructures;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

public class MiniSetTest {
    public void testAddIterateHappyPath(MiniSet<String> implUnderTest) {
        assertFalse(implUnderTest.add("apple"));
        assertFalse(implUnderTest.add("5"));
        assertTrue(implUnderTest.add("apple"));
        assertFalse(implUnderTest.add("1000"));

        int n = 0;
        for (String s : implUnderTest.asIterable()) {
            if ("apple".equals(s)) {
                n++;
            } else if ("5".equals(s)) {
                n++;
            } else if ("1000".equals(s)) {
                n++;
            }
        }
        assertEquals(3, n, "Iteration should have found 3 items, as 'apple' was duplicated");
    }

    public void testIterateEmptyHasNoneAndDoesNotThrow(MiniSet<String> implUnderTest) {
        try {
            String iterationResultStr =
                    StreamSupport
                            .stream(implUnderTest.asIterable().spliterator(), false)
                            .collect(Collectors.joining("-"));
            assertEquals("", iterationResultStr);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("An empty MiniSet shouldn't puke when iterated");
        }

    }
}