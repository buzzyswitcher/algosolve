package ru.volkov.leetcode.easy.valid_mountain_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testValidMountainArray() {

        int[] arr = new int[]{2,1};

        assertFalse(new Solution().validMountainArray(arr));
    }

    @Test
    public void testValidMountainArray_2() {

        int[] arr = new int[]{3,5,5};

        assertFalse(new Solution().validMountainArray(arr));
    }

    @Test
    public void testValidMountainArray_3() {

        int[] arr = new int[]{0,3,2,1};

        assertTrue(new Solution().validMountainArray(arr));
    }

    @Test
    public void testValidMountainArray_4() {

        int[] arr = new int[]{2,0,2};

        assertFalse(new Solution().validMountainArray(arr));
    }

    @Test
    public void testValidMountainArray_5() {

        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};

        assertFalse(new Solution().validMountainArray(arr));
    }
}