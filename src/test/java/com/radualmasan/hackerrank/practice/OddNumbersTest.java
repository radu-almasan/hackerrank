package com.radualmasan.hackerrank.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddNumbersTest {

    private OddNumbers oddNumbers = new OddNumbers();

    @Test
    void shouldPassGivenExample1() {
        List<Integer> actual = oddNumbers.oddNumbers(2, 5);
        assertEquals(Arrays.asList(3, 5), actual);
    }

    @Test
    void shouldPassGivenExample2() {
        List<Integer> actual = oddNumbers.oddNumbers(3, 9);
        assertEquals(Arrays.asList(3, 5, 7, 9), actual);
    }

}