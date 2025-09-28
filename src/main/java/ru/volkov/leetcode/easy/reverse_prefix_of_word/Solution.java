package ru.volkov.leetcode.easy.reverse_prefix_of_word;

import java.util.Queue;
import java.util.Stack;

class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack<>();

        boolean mustBeReversed = false;
        for (Character c : word.toCharArray()) {
            stack.push(c);
            if (c == ch) {
                mustBeReversed = true;
                break;
            }
        }

        if (mustBeReversed) {
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }

            String replacement = sb.toString();
            String target = sb.reverse().toString();

            return word.replace(target, replacement);
        } else {
            return word;
        }
    }
}
