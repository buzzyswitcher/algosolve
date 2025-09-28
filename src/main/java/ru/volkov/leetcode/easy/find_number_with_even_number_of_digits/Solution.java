package ru.volkov.leetcode.easy.find_number_with_even_number_of_digits;

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int numbers = (int) Math.log10((double) num) + 1;
            if (numbers % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
