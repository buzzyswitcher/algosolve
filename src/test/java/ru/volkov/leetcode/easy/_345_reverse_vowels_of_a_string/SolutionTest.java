package ru.volkov.leetcode.easy._345_reverse_vowels_of_a_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseVowels_test_1() {
        Solution solution = new Solution();
        String result = solution.reverseVowels("IceCreAm");
        assertEquals("AceCreIm", result);
    }
}