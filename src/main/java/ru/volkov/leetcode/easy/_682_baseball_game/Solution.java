package ru.volkov.leetcode.easy._682_baseball_game;

import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game
 */
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for (String s : operations) {
            if (s.matches("-?\\d+")) {
                stack.push(Integer.valueOf(s));
            } else if ("C".equals(s)) {
                stack.pop();
            } else if ("D".equals(s)) {
                Integer a = stack.pop();
                Integer b = stack.peek();
                Integer c = a * b;
                stack.push(c);
            } else if ("+".equals(s)) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return 0;
        }

        return stack.stream().reduce(0, Integer::sum);
    }
}