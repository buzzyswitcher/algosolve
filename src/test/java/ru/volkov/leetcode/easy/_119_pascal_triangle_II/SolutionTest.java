package ru.volkov.leetcode.easy._119_pascal_triangle_II;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test_1() {
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(3);
        List<Integer> expected = List.of(1,3,3,1);

        Assert.assertEquals(expected, list);

        System.out.println(list);
    }

    @Test
    public void test_2() {
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(0);
        List<Integer> expected = List.of(1);

        Assert.assertEquals(expected, list);

        System.out.println(list);
    }

    @Test
    public void test_3() {
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(1);
        List<Integer> expected = List.of(1,1);

        Assert.assertEquals(expected, list);

        System.out.println(list);
    }
}