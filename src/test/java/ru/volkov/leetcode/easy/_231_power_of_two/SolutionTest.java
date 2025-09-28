package ru.volkov.leetcode.easy._231_power_of_two;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_true() {
        Solution solution = new Solution();
        assertEquals(true, solution.isPowerOfTwo(4));
    }

    @Test
    public void should_return_false() {
        Solution solution = new Solution();
        assertEquals(false, solution.isPowerOfTwo(12));
    }
}