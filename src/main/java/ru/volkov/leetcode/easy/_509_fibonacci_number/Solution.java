package ru.volkov.leetcode.easy._509_fibonacci_number;

import java.util.HashMap;

public class Solution {

    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {
        if (n < 1) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int fib_1 = 0;
        if (cache.containsKey(n - 1)) {
            fib_1 = cache.get(n - 1);
        } else {
            fib_1 = fib(n - 1);
            cache.put(n - 1, fib_1);
        }

        int fib_2 = 0;
        if (cache.containsKey(n - 2)) {
            fib_2 = cache.get(n - 2);
        } else {
            fib_2 = fib(n - 2);
            cache.put(n - 2, fib_2);
        }

        int result = fib_1 + fib_2;

        cache.put(n, result);

        return result;
    }
}
