package ru.volkov.leetcode.easy._349_intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result1 = createMaskArray(nums1);
        int[] result2 = createMaskArray(nums2);

        List<Integer> resArray = new ArrayList<>();

        for (int i = 0; i < result1.length; i++) {
            if (result1[i] == 1 && result2[i] == 1) {
                resArray.add(i);
            }
        }

        return resArray.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] createMaskArray(int[] nums1) {
        int[] result = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];
            result[value] = 1;
        }

        return result;
    }
}
