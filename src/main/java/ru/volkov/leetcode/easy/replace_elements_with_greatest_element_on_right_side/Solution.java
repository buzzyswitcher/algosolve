package ru.volkov.leetcode.easy.replace_elements_with_greatest_element_on_right_side;

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
            max = Integer.MIN_VALUE;

            if (i == arr.length - 1) {
                arr[i] = -1;
            }
        }

        return arr;
    }
}