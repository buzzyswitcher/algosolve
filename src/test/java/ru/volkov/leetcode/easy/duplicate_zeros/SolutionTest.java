package ru.volkov.leetcode.easy.duplicate_zeros;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testDuplicateWhenZeros() {

        int[] arr = new int[]{1,0,2,3,0,4,5,0};

        //assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, Solution.duplicate(arr));
    }

    @Test
    public void testDuplicateWithoutZeros() {

        int[] arr = new int[]{1,2,3};

        //assertArrayEquals(new int[]{1,2,3}, Solution.duplicate(arr));
    }
}