package ru.volkov.leetcode.easy.squares_of_a_sorted_array;


import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in
 * non-decreasing order.
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class Solution {

    public int[] sortedSquares(int[] nums) {
        return twoPointers(nums);
    }

    private int[] standardLibrary(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    private int[] twoPointers(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int sortedArray_idx = sortedArray.length - 1;

        int head_idx = 0;
        int tail_idx = nums.length - 1;

        while (head_idx <= tail_idx) {
            int head = nums[head_idx] * nums[head_idx];
            int tail = nums[tail_idx] * nums[tail_idx];

            if (head > tail) {
                sortedArray[sortedArray_idx] = head;
                head_idx++;
            } else {
                sortedArray[sortedArray_idx] = tail;
                tail_idx--;
            }
            sortedArray_idx--;
        }

        return sortedArray;
    }
}
