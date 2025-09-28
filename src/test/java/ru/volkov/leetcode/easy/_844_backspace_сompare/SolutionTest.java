package ru.volkov.leetcode.easy._844_backspace_сompare;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void should_return_true_1() {
        String s = "ab#c";
        String t = "ad#c";

        Solution solution = new Solution();

        Assert.assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    public void should_return_true_2() {
        String s = "ab#ct#";
        String t = "ad#c";

        Solution solution = new Solution();

        Assert.assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    public void should_return_false_1() {
        String s = "ab";
        String t = "ad#c";

        Solution solution = new Solution();

        Assert.assertFalse(solution.backspaceCompare(s, t));
    }

    @Test
    public void should_return_false_2() {
        String s = "";
        String t = "ad#c";

        Solution solution = new Solution();

        Assert.assertFalse(solution.backspaceCompare(s, t));
    }

    @Test
    public void should_return_false_3() {
        String s = "a##c";
        String t = "#a#c";

        Solution solution = new Solution();

        Assert.assertFalse(solution.backspaceCompare(s, t));
    }
}
