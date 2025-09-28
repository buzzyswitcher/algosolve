package ru.volkov.leetcode.easy._27_remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int last = 0;
        int first = 0;

        while (first < nums.length) {
            if (nums[last] != val) {
                last++;
                first++;
                continue;
            }

            if (nums[last] == val) {
                while (first < nums.length) {
                    if (nums[first] != val) {
                        nums[last] = nums[first];
                        nums[first] = val;
                        last++;
                        first++;
                        break;
                    }

                    first++;
                }
            }
        }

        return last;
    }
}
