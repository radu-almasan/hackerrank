package com.radualmasan.hackerrank.practice;

import java.util.List;

public class FindTheNumber {

    public String findNumber(List<Integer> arr, int k) {
        return arr.contains(k) ? "YES" : "NO";
    }

}
