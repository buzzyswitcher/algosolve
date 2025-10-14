package ru.volkov.leetcode.easy._1984_minimum_difference_between_highest_and_lowest_of_k_scores;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores
 */
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int begin = 0;

        int result = Integer.MAX_VALUE;
        for (int end = k - 1; end < nums.length; end ++) {
            result = Math.min(nums[end] - nums[begin], result);
            begin ++;
        }

        return result;
    }
}
