package org.akash.streams;
import org.akash.DS_L0.SumSet;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSetTest {

    @Test
    void testSumSet() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 3);
        Map<Integer, List<Integer>> result = SumSet.consecutiveSumSet(numbers);
        Map<Integer, List<Integer>> expected = new LinkedHashMap<>();
        expected.put(1, Arrays.asList(1, 2, 3)); // Consecutive triplet sums to 6
        expected.put(2, Arrays.asList(2,3,1));
        expected.put(3, Arrays.asList(3,1,2));
        expected.put(4,Arrays.asList(1,2,3));
        assertEquals(expected, result, "The sumSet result should match the expected output.");
    }
}

