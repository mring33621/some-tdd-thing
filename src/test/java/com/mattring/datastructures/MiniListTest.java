package com.mattring.datastructures;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

public class MiniListTest {

    public void testAddIterateHappyPath(MiniList<String> implUnderTest) {
        implUnderTest.add("apple");
        implUnderTest.add("5");
        implUnderTest.add("apple");
        implUnderTest.add("1000");
        String iterationResultStr =
                StreamSupport
                .stream(implUnderTest.asIterable().spliterator(), false)
                .collect(Collectors.joining("-"));
        assertEquals("apple-5-apple-1000", iterationResultStr);
    }

    public void testIterateEmptyHasNoneAndDoesNotThrow(MiniList<String> implUnderTest) {
        try {
            String iterationResultStr =
                    StreamSupport
                            .stream(implUnderTest.asIterable().spliterator(), false)
                            .collect(Collectors.joining("-"));
            assertEquals("", iterationResultStr);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("An empty MiniList shouldn't puke when iterated");
        }

    }

}