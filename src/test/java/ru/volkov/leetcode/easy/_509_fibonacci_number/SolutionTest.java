package ru.volkov.leetcode.easy._509_fibonacci_number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test_0() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.fib(0));
    }

    @Test
    public void test_1() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.fib(1));
    }

    @Test
    public void test_2() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.fib(3));
    }

    @Test
    public void test_3() {
        Solution solution = new Solution();
        Assert.assertEquals(24, solution.fib(6));
    }
}