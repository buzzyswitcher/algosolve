package ru.volkov.leetcode.easy.max_consecutive_ones;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_0() {
        int[] arr = new int[]{0,0,0,0,0,0};

        Solution solution = new Solution();
        assertEquals(0, solution.findMaxConsecutiveOnes(arr));
    }

    @Test
    public void should_return_1() {
        int[] arr = new int[]{1,0,0,0,0,0};

        Solution solution = new Solution();
        assertEquals(1, solution.findMaxConsecutiveOnes(arr));
    }

    @Test
    public void should_return_6() {
        int[] arr = new int[]{1,1,1,1,1,1};

        Solution solution = new Solution();
        assertEquals(6, solution.findMaxConsecutiveOnes(arr));
    }

    @Test
    public void should_return_3() {
        int[] arr = new int[]{1,1,0,1,1,1};

        Solution solution = new Solution();
        assertEquals(3, solution.findMaxConsecutiveOnes(arr));
    }

}