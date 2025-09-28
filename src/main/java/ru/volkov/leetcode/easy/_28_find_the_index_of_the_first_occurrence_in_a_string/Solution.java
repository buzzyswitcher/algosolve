package ru.volkov.leetcode.easy._28_find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int h = i;
                int n = 0;
                while (h < haystack.length() && n < needle.length()) {
                    if (haystack.charAt(h) == needle.charAt(n)) {
                        h++;
                        n++;
                    } else {
                        break;
                    }
                }

                if (n == needle.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
