package ru.volkov.leetcode.easy._1876_substrings_of_size_three_with_distinct_characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countGoodSubstrings_xyzzaz() {
        String s = "xyzzaz";

        Solution solution = new Solution();
        assertEquals(1, solution.countGoodSubstrings(s));
    }

    @Test
    public void countGoodSubstrings_aababcabc() {
        String s = "aababcabc";

        Solution solution = new Solution();
        assertEquals(4, solution.countGoodSubstrings(s));
    }
}