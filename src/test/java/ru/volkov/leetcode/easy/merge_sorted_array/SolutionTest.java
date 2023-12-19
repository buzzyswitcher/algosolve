package ru.volkov.leetcode.easy.merge_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMerge() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void testMergeWhenNums2LengthIsZero() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};

        solution.merge(nums1, 1, nums2, 0);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testMergeWhenArraysLengthIsOne() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        solution.merge(nums1, 0, nums2, 1);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testMerge_3() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{2,0};
        int[] nums2 = new int[]{1};

        solution.merge(nums1, 1, nums2, 1);

        assertArrayEquals(new int[]{1,2}, nums1);
    }
}