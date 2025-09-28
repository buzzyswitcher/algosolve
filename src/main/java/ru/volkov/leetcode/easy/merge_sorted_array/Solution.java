package ru.volkov.leetcode.easy.merge_sorted_array;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1.length == 0 || nums2.length == 0) {
            return;
        }

        if (m == 0 && n != 0) {
            nums1 = Arrays.copyOf(nums2, 1);
        }

        int wr1 = nums1.length - 1;
        int rd1 = m - 1;
        int rd2 = n - 1;

        while (rd1 >= 0 && rd2 >= 0) {
            if (nums2[rd2] > nums1[rd1]) {
                nums1[wr1] = nums2[rd2];
                wr1--;
                rd2--;
                continue;
            }

            if (nums1[rd1] > nums2[rd2]) {
                nums1[wr1] = nums1[rd1];
                nums1[rd1] = nums2[rd2];
                wr1--;
                rd1--;
                rd2--;
                continue;
            }

            if (nums1[rd1] == nums2[rd2]) {
                nums1[wr1] = nums1[rd1];
                wr1--;
                rd1--;
                rd2--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public void merge_2(int[] nums1, int m, int[] nums2, int n) {

        int writeIdx = m;
        for (int i = 0; i < nums2.length; i++) {
            nums1[writeIdx] = nums2[i];
            writeIdx++;
        }

        Arrays.sort(nums1);
    }
}
