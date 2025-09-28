package ru.volkov.leetcode.easy._125_valid_palindrome;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        String res = s.toLowerCase();

        while (last > first) {
            if (!isAlphaNumeric(res.charAt(first))) {
                first++;
                continue;
            }

            if (!isAlphaNumeric(res.charAt(last))) {
                last--;
                continue;
            }

            if (res.charAt(first) == res.charAt(last)) {
                first++;
                last--;
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 48 && c <= 57) || (c >= 97 && c <= 122); // 'a'–'z'
    }
}