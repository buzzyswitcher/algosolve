package ru.volkov.leetcode.easy._392_is_subsequence;

/**
 * https://leetcode.com/problems/is-subsequence
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int first = 0;
        int second = 0;

        while (first < s.length()) {
            if (second == t.length()) {
                return false;
            }

            if (s.charAt(first) == t.charAt(second)) {
                first ++;
                second ++;
                continue;
            }

            if (s.charAt(first) != t.charAt(second)) {
                second ++;
            }
        }

        return true;
    }
}
