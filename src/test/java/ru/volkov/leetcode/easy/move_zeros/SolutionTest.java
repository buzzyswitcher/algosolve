package ru.volkov.leetcode.easy.move_zeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMoveZeroes() {

        int[] nums = new int[]{0,1,0,3,12};
        new Solution().moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }

    @Test
    public void testMoveZeroes_1() {

        int[] nums = new int[]{1};
        new Solution().moveZeroes(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    public void testMoveZeroes_2() {

        int[] nums = new int[]{1,0};
        new Solution().moveZeroes(nums);
        assertArrayEquals(new int[]{1,0}, nums);
    }

    @Test
    public void testMoveZeroes_3() {

        int[] nums = new int[]{0,1};
        new Solution().moveZeroes(nums);
        assertArrayEquals(new int[]{1,0}, nums);
    }
}