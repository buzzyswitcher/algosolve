package ru.volkov.leetcode.easy._680_valid_palindrome_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void validPalindrome_test_1() {
        Solution solution = new Solution();
        String s = "abc";
        assertFalse(solution.validPalindrome(s));
    }

    @Test
    public void validPalindrome_test_2() {
        Solution solution = new Solution();
        String s = "aguokepatgbnvfqmgmlCupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucUlmgmqfvnbgtapekouga";
        assertTrue(solution.validPalindrome(s));
    }
}