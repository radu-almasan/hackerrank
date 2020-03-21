package com.radualmasan.hackerrank.warmup;

public class JumpingOnClouds {

    public int findRequiredSteps(int[] c) {
        int totalSteps = 0;

        int pos = 0;
        while (pos < c.length - 1) {
            if (pos < c.length - 2 && c[pos + 2] == 0)
                pos += 2;
            else
                pos++;

            totalSteps++;
        }

        return totalSteps;
    }

}
