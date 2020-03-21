package com.radualmasan.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {

    private JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

    @Test
    void shouldPassGivenExample1() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 1, 0, 0, 0, 1, 0});
        assertEquals(3, steps);
    }

    @Test
    void shouldPassGivenExample2() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 0, 1, 0, 0, 1, 0});
        assertEquals(4, steps);
    }

    @Test
    void shouldPassSimpleExtremeCase() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 0});
        assertEquals(1, steps);
    }

    @Test
    void shouldPassSimpleExtremeCase2() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 0, 0});
        assertEquals(1, steps);
    }

    @Test
    void shouldPassSimpleExtremeCase3() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 0, 0, 0});
        assertEquals(2, steps);
    }

    @Test
    void shouldPassSimpleExtremeCase4() {
        int steps = jumpingOnClouds.findRequiredSteps(new int[]{0, 0, 1, 0, 0});
        assertEquals(3, steps);
    }


}

// 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0