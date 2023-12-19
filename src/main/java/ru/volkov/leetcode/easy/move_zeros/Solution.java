package ru.volkov.leetcode.easy.move_zeros;

class Solution {
    public void moveZeroes(int[] nums) {

        if (nums.length == 1 && nums[0] != 0) {
            return;
        }

        int writeHere = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeHere] = nums[i];
                writeHere++;
            }
        }

        for (int i = nums.length - 1; i >= nums.length - (nums.length - writeHere); i--) {
            nums[i] = 0;
        }
    }
}