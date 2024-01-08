package org.example.RTI_JAVA;
import java.util.*;
public class ElementCounter {
    public static void counter() {

        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> elementCount = new HashMap<>();

        for (int element : arr) {
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }

        System.out.println(elementCount);
    }





}
