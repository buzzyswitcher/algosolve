package ru.volkov.leetcode.easy._2269_find_the_k_beauty_of_a_number;

/**
 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/
 */
class Solution {
    public int divisorSubstrings(int num, int k) {
        String sNum = String.valueOf(num);
        int begin = 0;
        int divisors = 0;
        for (int end = 0; end < sNum.length(); end++) {
            if (end - begin != k - 1) {
                continue;
            }

            int subNum = Integer.parseInt(sNum.substring(begin, end + 1));

            if (subNum > 0 && num % subNum == 0) {
                divisors++;
            }

            begin++;
        }

        return divisors;
    }
}
