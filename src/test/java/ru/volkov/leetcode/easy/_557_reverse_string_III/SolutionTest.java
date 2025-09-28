package ru.volkov.leetcode.easy._557_reverse_string_III;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseWords_test_1() {
        Solution solution = new Solution();
        String s = "Let's take LeetCode contest";
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords(s));
    }
}