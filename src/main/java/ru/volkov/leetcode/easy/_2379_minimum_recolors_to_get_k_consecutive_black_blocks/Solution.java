package ru.volkov.leetcode.easy._2379_minimum_recolors_to_get_k_consecutive_black_blocks;


/**
 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
 */
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int begin = 0;
        int minimum = Integer.MAX_VALUE;
        int wCount = 0;
        for (int end = 0; end < blocks.length(); end++) {
            if (blocks.charAt(end) == 'W') {
                wCount++;
            }

            if (end == blocks.length() - 1) {
                minimum = Math.min(minimum, wCount);
            }

            if (end - begin + 1 == k) {
                minimum = Math.min(minimum, wCount);

                // вываливаемся из окна
                if (blocks.charAt(begin) == 'W') {
                    wCount--;
                }

                begin++;
            }
        }

        return minimum;
    }
}