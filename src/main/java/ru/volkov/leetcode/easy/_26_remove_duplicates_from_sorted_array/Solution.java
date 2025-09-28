package ru.volkov.leetcode.easy._26_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int last = 0;
        int first = 0;
        int toCopy = 1;

        while (first < nums.length) {
            if (nums[last] == nums[first]) {
                first++;
                continue;
            }

            if (nums[last] != nums[first]) {
                nums[toCopy] = nums[first];
                toCopy++;
                last = first;
            }
        }

        return toCopy;
    }
}
