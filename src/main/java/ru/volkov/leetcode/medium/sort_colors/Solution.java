package ru.volkov.leetcode.medium.sort_colors;

import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int mid = 0;
        int hi = nums.length - 1;

        while (mid <= hi) {
            int res = nums[mid];
            switch (res) {
                case 0:
                    swap(nums, lo, mid);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, hi, mid);
                    hi--;
                    break;
                default:
                    break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
