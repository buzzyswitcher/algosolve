package ru.volkov.leetcode.easy._680_valid_palindrome_ii;

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        boolean symbolAlreadyDeleted = false;

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                System.out.println(String.format("{%s} equals to {%s}", s.charAt(left), s.charAt(right)));
                left++;
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) {
                System.out.println(String.format("{%s} not equals to {%s}", s.charAt(left), s.charAt(right)));

                if (symbolAlreadyDeleted) {
                    return false;
                }

                if (s.charAt(left + 1) == s.charAt(right)) {
                    System.out.println(String.format("{%s} equals to {%s} after delete left char", s.charAt(left), s.charAt(right)));
                    symbolAlreadyDeleted = true;
                    left++;
                    continue;
                }

                if (s.charAt(left) == s.charAt(right - 1)) {
                    System.out.println(String.format("{%s} equals to {%s} after delete right char", s.charAt(left), s.charAt(right)));
                    symbolAlreadyDeleted = true;
                    right--;
                    continue;
                }

                return false;
            }
        }

        return true;
    }
}