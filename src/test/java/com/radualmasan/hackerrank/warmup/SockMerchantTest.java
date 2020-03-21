package com.radualmasan.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SockMerchantTest {

    private SockMerchant sockMerchant = new SockMerchant();

    @Test
    void shouldPassGivenExample1() {
        long numberOfMatchingPairs = sockMerchant.findNumberOfMatchingPairs(7, new int[]{1, 2, 1, 2, 1, 3, 2});
        assertEquals(2, numberOfMatchingPairs);
    }

    @Test
    void shouldPassGivenExample2() {
        long numberOfMatchingPairs = sockMerchant.findNumberOfMatchingPairs(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        assertEquals(3, numberOfMatchingPairs);
    }

    @Test
    void shouldPassRandomlyGenerateHugeArray() {
        Map<Integer, Integer> occurrences = new HashMap<>();

        int n = 100_000_000;
        int[] colors = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int color = random.nextInt(100);
            colors[i] = color;
            occurrences.merge(color, 1, Integer::sum);
        }

        long actual = sockMerchant.findNumberOfMatchingPairs(colors.length, colors);

        int expected = occurrences.values().stream().mapToInt(val -> val / 2).sum();
        assertEquals(expected, actual);
    }
}