package ru.volkov.leetcode.easy.max_consecutive_ones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int curConsecutiveOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                curConsecutiveOnes++;
            } else {
                curConsecutiveOnes = 0;
            }

            if (curConsecutiveOnes > maxConsecutiveOnes) {
                maxConsecutiveOnes = curConsecutiveOnes;
            }
        }

        return maxConsecutiveOnes;
    }
}
