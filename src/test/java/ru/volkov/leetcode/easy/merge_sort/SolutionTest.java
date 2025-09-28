package ru.volkov.leetcode.easy.merge_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        int[] array = new int[]{38, 27, 43, 3, 9, 82, 10};
        Solution solution = new Solution();
        solution.mergeSort(array);
    }
}