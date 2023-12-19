package ru.volkov.leetcode.easy.max_consecutive_ones;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return getMaxConsecutiveOnes(nums);
    }

    public static int getMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 1 ? 1 : 0;
        }

        int maxSequence = 0;
        int windowLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                windowLength++;
            }
            if (nums[i] == 0) {
                windowLength = 0;
            }

            if (windowLength > maxSequence) {
                maxSequence = windowLength;
            }
        }

        return maxSequence;
    }
}
