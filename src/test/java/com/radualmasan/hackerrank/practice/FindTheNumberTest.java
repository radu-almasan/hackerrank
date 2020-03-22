package com.radualmasan.hackerrank.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindTheNumberTest {

    private FindTheNumber findTheNumber = new FindTheNumber();

    @Test
    void shouldPassGivenExample1() {
        String actual = findTheNumber.findNumber(Arrays.asList(1, 2, 3, 4, 5), 5);
        assertEquals("YES", actual);
    }

    @Test
    void shouldPassGivenExample2() {
        String actual = findTheNumber.findNumber(Arrays.asList(2, 3, 1), 5);
        assertEquals("NO", actual);
    }

}