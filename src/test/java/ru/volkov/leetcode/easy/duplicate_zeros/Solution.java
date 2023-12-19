package ru.volkov.leetcode.easy.duplicate_zeros;

class Solution {
    public void duplicateZeros(int[] arr) {
        duplicate(arr);
    }

    public void duplicate(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }

    }
}
