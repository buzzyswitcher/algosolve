package ru.volkov.leetcode.easy._70_climbing_stairs;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            int i = climbStairs(n - 1) + climbStairs(n - 2);
            cache.put(n, i);
            return i;
        }
    }
}