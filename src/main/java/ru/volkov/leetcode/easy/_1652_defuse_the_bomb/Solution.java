package ru.volkov.leetcode.easy._1652_defuse_the_bomb;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];

        int sum = 0;
        for (int i = 0; i < code.length; i++) {
            sum = sum + code[i];
        }


        for (int j = 0; j < code.length; j++) {
            if (code[j] == 0) {
                res[j] = 0;
                continue;
            }

            int direction = k > 0 ? 1 : -1;
            int secIdx = (j + direction * k) % code.length;
            if (secIdx < 0) {
                secIdx = secIdx + code.length;
            }

            int left = Math.min(j, secIdx);
            int right = Math.max(j, secIdx);

            int subSum = 0;

            while (left <= right) {
                subSum = subSum + code[left];
                left ++;
            }

            res[j] = sum - subSum;
        }

        return res;
    }
}