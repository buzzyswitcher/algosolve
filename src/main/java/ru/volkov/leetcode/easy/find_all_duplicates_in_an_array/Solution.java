package ru.volkov.leetcode.easy.find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[correctIndex] == nums[i]) {
                i++;
            } else {
                swap(nums, correctIndex, i);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]);
            }
        }

        return duplicates;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
