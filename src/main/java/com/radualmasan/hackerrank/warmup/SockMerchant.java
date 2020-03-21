package com.radualmasan.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    public long findNumberOfMatchingPairs(int n, int[] ar) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int color : ar)
            occurrences.merge(color, 1, Integer::sum);

        return occurrences.values().stream()
                .mapToInt(val -> val / 2)
                .sum();
    }

}
