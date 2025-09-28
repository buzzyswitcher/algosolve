package ru.volkov.leetcode.easy.reverse_prefix_of_word;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals("dcbaefd", solution.reversePrefix("abcdefd", 'd'));
    }

    @Test
    public void test1() {
        Solution solution = new Solution();
        assertEquals("zxyxxe", solution.reversePrefix("xyxzxe", 'z'));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        assertEquals("abcd", solution.reversePrefix("abcd", 'z'));
    }
}