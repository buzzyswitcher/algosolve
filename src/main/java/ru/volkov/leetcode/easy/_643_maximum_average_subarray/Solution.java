package ru.volkov.leetcode.easy._643_maximum_average_subarray;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int begin = 0;
        double sum = -Double.MAX_VALUE;
        double currSum = 0;
        for (int end = 0; end < nums.length; end ++) {
            currSum = currSum + nums[end];
            if (end - begin + 1 == k) {
                sum = Math.max(sum, currSum);

                currSum = currSum - nums[begin];
                begin ++;
            }
        }
        return sum / k;
    }
}
