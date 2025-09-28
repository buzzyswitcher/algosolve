package ru.volkov.leetcode.easy.duplicate_zeros;

class Solution {
    public void duplicateZeros(int[] arr) {

        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndex = i;
                for (int j = arr.length - 1; j > zeroIndex; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[zeroIndex] = 0;
                i++;
            }
        }
    }
}
