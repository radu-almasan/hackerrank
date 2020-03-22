package com.radualmasan.hackerrank.warmup;

public class RepeatedString {

    public long findOccurrenceCount(String s, long n) {
        long fullRepeatTimes = n / s.length();
        long remainder = n % s.length();

        long occurences = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 'a')
                occurences += i < remainder ? fullRepeatTimes + 1 : fullRepeatTimes;
        }

        return occurences;
    }

}
