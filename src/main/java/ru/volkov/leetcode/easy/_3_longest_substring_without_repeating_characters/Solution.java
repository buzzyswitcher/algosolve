package ru.volkov.leetcode.easy._3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        Set<Character> seen = new HashSet<>();
        int begin = 0;
        int maxLength = Integer.MIN_VALUE;

        for (int end = 0; end < s.length(); end ++) {
            if (!seen.contains(s.charAt(end))) {
                seen.add(s.charAt(end));
                maxLength = Math.max(maxLength, seen.size());
            } else {
                while (seen.contains(s.charAt(end))) {
                    seen.remove(s.charAt(begin));
                    begin ++;
                }

                seen.add(s.charAt(end));
            }
        }

        return maxLength;
    }
}