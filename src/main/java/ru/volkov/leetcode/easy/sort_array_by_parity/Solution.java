package ru.volkov.leetcode.easy.sort_array_by_parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        if (nums.length == 2 &&  nums[1] % 2 == 0) {
            return nums;
        }

        int even = 0;
        int odd = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[even] % 2 == 0) {
                even++;
            }

            if (nums[odd] % 2 != 0) {
                odd--;
            }

            if (nums[even] % 2 != 0 && nums[odd] % 2 == 0) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }

            if (even + 1 == odd || even == odd) {
                break;
            }
        }
        return nums;
    }
}
