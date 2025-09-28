package ru.volkov.leetcode.easy._696_count_binary_substrings;

public class Solution {

    public int countBinarySubstrings(String s) {
        int result = 0;

        int curr = 0;
        while (curr < s.length()) {

            int zero = 0;
            int ones = 0;

            int subCurr = curr;
            while (subCurr < s.length()) {
                if (s.charAt(subCurr) == '0') {
                    zero ++;
                    if (zero - ones == 0) {
                        result ++;
                        break;
                    }
                    subCurr ++;
                    continue;
                }

                if (s.charAt(subCurr) == '1') {
                    ones ++;
                    if (zero - ones == 0) {
                        result ++;
                        break;
                    }
                    subCurr ++;
                    continue;
                }
            }

            curr ++;
        }

        return result;
    }
}
