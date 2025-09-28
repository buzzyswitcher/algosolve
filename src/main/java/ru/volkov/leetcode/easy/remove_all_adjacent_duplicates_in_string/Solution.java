package ru.volkov.leetcode.easy.remove_all_adjacent_duplicates_in_string;

import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                Character fromStack = stack.peek();
                if (fromStack.equals(ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
