package ru.volkov.leetcode.easy._3_longest_substring_without_repeating_characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        String test = "pwwkew";

        assertEquals(3, new Solution().lengthOfLongestSubstring(test));
    }
}