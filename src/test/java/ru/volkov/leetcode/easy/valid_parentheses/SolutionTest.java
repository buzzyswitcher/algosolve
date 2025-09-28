package ru.volkov.leetcode.easy.valid_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void should_return_true_1() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("{}[]{}()"));
    }

    @Test
    public void should_return_true_2() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("([])"));
    }

    @Test
    public void should_return_false_1() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isValid("{)"));
    }

    @Test
    public void should_return_false_2() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isValid("[[[[]"));
    }
}
