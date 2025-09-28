package ru.volkov.leetcode.easy._28_find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {

        Solution solution = new Solution();

        int result = solution.strStr("hello", "ll");
        assertEquals(2, result);
    }

    @Test
    public void test_2() {

        Solution solution = new Solution();

        int result = solution.strStr("leetcode", "leeto");
        assertEquals(-1, result);
    }

    @Test
    public void test_3() {

        Solution solution = new Solution();

        int result = solution.strStr("mississippi", "issip");
        assertEquals(4, result);
    }
}