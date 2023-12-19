package ru.volkov.leetcode.easy.max_consecutive_ones;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testGetMaxConsecutiveOnes() {
        int[] nums = new int[]{1,1,0,1,1,1};
        assertEquals(3, Solution.getMaxConsecutiveOnes(nums));
    }
}