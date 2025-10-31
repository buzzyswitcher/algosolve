package ru.volkov.leetcode.easy._455_assign_cookies;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cookieIdx = 0;
        int childIdx = 0;
        int stastifaction = 0;

        while (childIdx < g.length && cookieIdx < s.length) {
            if (g[childIdx] <= s[cookieIdx]) {
                stastifaction = stastifaction + 1;
                childIdx++;
                cookieIdx++;
                continue;
            }

            if (g[childIdx] > s[cookieIdx]) {
                cookieIdx++;
            }
        }

        return stastifaction;
    }
}
