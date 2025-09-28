package ru.volkov.leetcode.easy.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappearedNums = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i] - 1;

            if (nums[i] == nums[correctIndex]) {
                i++;
            } else {
                swap(nums, i, correctIndex);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                disappearedNums.add(j + 1);
            }
        }

        return disappearedNums;

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
