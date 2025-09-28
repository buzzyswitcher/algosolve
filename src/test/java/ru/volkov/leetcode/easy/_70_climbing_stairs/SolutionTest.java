package ru.volkov.leetcode.easy._70_climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(8, solution.climbStairs(5));
    }
}