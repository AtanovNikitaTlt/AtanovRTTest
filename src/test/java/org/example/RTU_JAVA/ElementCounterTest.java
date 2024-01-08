package org.example.RTU_JAVA;

import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementCounterTest {
    @Test
    public void testElementCounter() {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(3, 1);
        expected.put(4, 2);
        expected.put(5, 2);

        Map<Integer, Integer> result = new HashMap<>();
        for (int element : arr) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }

        assertEquals(expected, result);
    }

}
