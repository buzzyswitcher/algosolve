package ru.volkov.leetcode.easy.find_numbers_with_even_number_of_digits;

class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int num : nums) {
            if (calculateNumberOfDigits(num) % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    public static int calculateNumberOfDigits(int num) {
        int result = 0;

        boolean run = true;
        int remainder = num;
        while (run) {
            remainder = remainder / 10;
            if (remainder == 0) {
                run = false;
            }
            result ++;
        }

        return result;
    }
}
