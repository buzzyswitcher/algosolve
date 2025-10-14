package ru.volkov.leetcode.easy._1984_minimum_difference_between_highest_and_lowest_of_k_scores;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumDifference_1() {
        int[] arr = {9,4,1,7};
        Solution solution = new Solution();
        assertEquals(2, solution.minimumDifference(arr, 2));
    }
}