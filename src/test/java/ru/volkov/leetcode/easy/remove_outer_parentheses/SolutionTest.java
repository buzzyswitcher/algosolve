package ru.volkov.leetcode.easy.remove_outer_parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        String s = "(()())(())";

        Solution solution = new Solution();
        assertEquals("()()()", solution.removeOuterParentheses(s));
    }

    @Test
    public void test_1() {
        String s = "(()())(())(()(()))";

        Solution solution = new Solution();
        assertEquals("()()()()(())", solution.removeOuterParentheses(s));
    }

    @Test
    public void test_2() {
        String s = "()()";

        Solution solution = new Solution();
        assertEquals("", solution.removeOuterParentheses(s));
    }



}