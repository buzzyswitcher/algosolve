package ru.volkov.leetcode.easy._1652_defuse_the_bomb;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void decrypt() {

        int[] arr = new int[]{5, 7, 1, 4};
        assertArrayEquals(new int[]{12, 10, 16, 13}, new Solution().decrypt(arr, 3));
    }
}