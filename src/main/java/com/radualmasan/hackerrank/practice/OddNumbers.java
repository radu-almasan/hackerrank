package com.radualmasan.hackerrank.practice;

import java.util.LinkedList;
import java.util.List;

public class OddNumbers {

    public List<Integer> oddNumbers(int l, int r) {
        int start = l % 2 == 0 ? l + 1 : l;
        int end = r % 2 == 0 ? r - 1 : r;

        List<Integer> oddNumbers = new LinkedList<>();
        for (int i = start; i <= end; i += 2)
            oddNumbers.add(i);

        return oddNumbers;
    }

}
