package ru.volkov.leetcode.easy._219_contains_duplicate_II;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int begin = 0;

        Set<Integer> seen = new HashSet<>();

        for (int end = 0; end < nums.length; end++) {
            if (seen.contains(nums[end])) {
                return true;
            } else {
                seen.add(nums[end]);
            }

            if ((end - begin) == k) {
                seen.remove(nums[begin]);
                begin ++;
            }
        }

        return false;
    }
}
