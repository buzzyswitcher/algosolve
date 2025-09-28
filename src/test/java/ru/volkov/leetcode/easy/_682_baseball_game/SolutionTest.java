package ru.volkov.leetcode.easy._682_baseball_game;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void should_return_32() {
        Solution solution = new Solution();
        String[] arr = new String[]{"5","2","C","D","+"};

        Assert.assertEquals(30, solution.calPoints(arr));
    }
}