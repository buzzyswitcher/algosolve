package ru.volkov.leetcode.easy.remove_outer_parentheses;

import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int balance = 0;
        for (Character ch : s.toCharArray()) {
            stack.push(ch);
            if ('(' == ch) {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                sb.append(removeOuter(stack));
                stack.clear();
            }
        }

        return sb.toString();
    }

    private String removeOuter(Stack<Character> characterStack) {
        StringBuilder sb = new StringBuilder();
        characterStack.pop();

        while (characterStack.size() != 1) {
            sb.append(characterStack.pop());
        }

        return sb.reverse().toString();
    }
}
