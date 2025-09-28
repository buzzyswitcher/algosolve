package ru.volkov.leetcode.easy.duplicate_zeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void duplicateZeros() {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};

        Solution solution = new Solution();
        solution.duplicateZeros(arr);
    }
}