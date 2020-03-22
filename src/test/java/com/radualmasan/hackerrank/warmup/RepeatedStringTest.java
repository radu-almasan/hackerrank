package com.radualmasan.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    private RepeatedString repeatedString = new RepeatedString();

    @Test
    void shouldPassGivenExample1() {
        long occurrences = repeatedString.findOccurrenceCount("abcac", 10);
        assertEquals(4, occurrences);
    }

    @Test
    void shouldPassGivenExample2() {
        long occurrences = repeatedString.findOccurrenceCount("aba", 10);
        assertEquals(7, occurrences);
    }


}