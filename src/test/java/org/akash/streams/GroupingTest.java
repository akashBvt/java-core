package org.akash.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GroupingTest {

    @Test
    public void testCharFrequency() {
        // Test case 1: Normal string
        String input = "hello";
        Map<Character, Long> expected = new HashMap<>();
        expected.put('h', 1L);
        expected.put('e', 1L);
        expected.put('l', 2L);
        expected.put('o', 1L);
        assertEquals(expected, Grouping.charFrequency(input));

    }
}
