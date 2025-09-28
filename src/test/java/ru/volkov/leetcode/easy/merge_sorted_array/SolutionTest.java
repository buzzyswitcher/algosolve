package ru.volkov.leetcode.easy.merge_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {

        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};

        Solution solution = new Solution();
        solution.merge_2(arr1, 3, arr2, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, arr1);
    }

    @Test
    public void merge_1() {

        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};

        Solution solution = new Solution();
        solution.merge_2(arr1, 0, arr2, 1);
        assertArrayEquals(new int[]{1}, arr1);
    }

    @Test
    public void merge_2() {

        int[] arr1 = new int[]{2,0};
        int[] arr2 = new int[]{1};

        Solution solution = new Solution();
        solution.merge_2(arr1, 1, arr2, 1);
        assertArrayEquals(new int[]{1,2}, arr1);
    }

    @Test
    public void merge_3() {

        int[] arr1 = new int[]{4,5,6,0,0,0};
        int[] arr2 = new int[]{1,2,3};

        Solution solution = new Solution();
        solution.merge_2(arr1, 3, arr2, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, arr1);
    }

    @Test
    public void merge_4() {

        int[] arr1 = new int[]{4,5,6,0,0,0};
        int[] arr2 = new int[]{1,2,3};

        Solution solution = new Solution();
        solution.merge_2(arr1, 3, arr2, 3);
        assertArrayEquals(arr1, new int[]{1,2,3,4,5,6});
    }
}