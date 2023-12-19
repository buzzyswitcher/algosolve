package ru.volkov.leetcode.easy.remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {

        int lastPosition = nums.length - 1;
        int amount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                nums[i] = nums[lastPosition];
                nums[lastPosition--] = val;
                amount++;
            }
        }

        return nums.length - amount;
    }
}
