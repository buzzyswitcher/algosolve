package ru.volkov.leetcode.easy.height_checker;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_3() {
        int[] arr = new int[]{1,1,4,2,1,3};
        Solution solution = new Solution();

        assertEquals(3, solution.heightChecker(arr));
    }
}