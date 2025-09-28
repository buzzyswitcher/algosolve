package ru.volkov.leetcode.medium._50_pow_x_n;

class Solution {
    public double myPow(double x, int n) {
        return pow(x, n);
    }

    double pow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        return x * pow(x, n - 1);
    }
}
