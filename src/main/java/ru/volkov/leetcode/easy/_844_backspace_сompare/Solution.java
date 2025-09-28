package ru.volkov.leetcode.easy._844_backspace_сompare;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare
 */
class Solution {

    public boolean backspaceCompare(String s, String t) {
        return cleanUp(s).equals(cleanUp(t));
    }


    private String cleanUp(String s) {
        Character backspace = '#';

        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (!backspace.equals(ch)) {
                stack.push(ch);
            }

            if (backspace.equals(ch) && !stack.empty()) {
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }
}