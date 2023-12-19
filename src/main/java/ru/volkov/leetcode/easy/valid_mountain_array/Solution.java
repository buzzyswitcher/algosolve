package ru.volkov.leetcode.easy.valid_mountain_array;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int peak = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }

            if (arr[i] > arr[i + 1]) {
                peak = i;
                break;
            }
        }

        if (peak == 0) {
            return false;
        }

        for (int j = peak; j < arr.length - 1; j++) {
            if (arr[j] == arr[j + 1]) {
                return false;
            }

            if (arr[j] < arr[j + 1]) {
                return false;
            }
        }

        return true;
    }
}
