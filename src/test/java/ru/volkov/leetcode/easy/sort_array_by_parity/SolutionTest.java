package ru.volkov.leetcode.easy.sort_array_by_parity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSortArrayByParity() {
        int[] nums = new int[]{3,1,2,4};

        Assert.assertArrayEquals(new int[]{4,2,1,3}, new Solution().sortArrayByParity(nums));
    }

    @Test
    public void testSortArrayByParity_1() {
        int[] nums = new int[]{0};

        Assert.assertArrayEquals(new int[]{0}, new Solution().sortArrayByParity(nums));
    }

    @Test
    public void testSortArrayByParity_2() {
        int[] nums = new int[]{0,2};

        Assert.assertArrayEquals(new int[]{0,2}, new Solution().sortArrayByParity(nums));
    }

    @Test
    public void testSortArrayByParity_3() {
        int[] nums = new int[]{1,0};

        Assert.assertArrayEquals(new int[]{0,1}, new Solution().sortArrayByParity(nums));
    }

    @Test
    public void testSortArrayByParity_4() {
        int[] nums = new int[]{0,1};

        Assert.assertArrayEquals(new int[]{0,1}, new Solution().sortArrayByParity(nums));
    }
}