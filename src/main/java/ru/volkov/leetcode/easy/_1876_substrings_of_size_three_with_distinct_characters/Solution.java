package ru.volkov.leetcode.easy._1876_substrings_of_size_three_with_distinct_characters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countGoodSubstrings(String s) {
        int begin = 0;
        int substrings = 0;
        Set<Character> seen = new HashSet();

        for (int end = 0; end <= s.length(); end ++) {
            if (end - begin < 3) {
                continue;
            } else {
                String sub = s.substring(begin, end);
                seen.clear();
                for (char c : sub.toCharArray()) {
                    seen.add(c);
                }

                if (seen.size() == 3) {
                    substrings ++;
                }
            }

            begin ++;
        }
        return substrings;
    }
}
