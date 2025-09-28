package ru.volkov.leetcode.easy._219_contains_duplicate_II;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsNearbyDuplicate_test_1() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,1};
        int k = 3;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void containsNearbyDuplicate_test_2() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,1,2,3};
        int k = 2;

        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }
}