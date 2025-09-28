package ru.volkov.leetcode.easy.valid_parentheses;

import java.util.List;
import java.util.Map;
import java.util.Stack;


class Solution {

    List<Character> openingBrackets = List.of('{', '(', '[');
    List<Character> closingBrackets = List.of('}', ')', ']');
    Map<Character, Character> bracketsPair = Map.of(
            '{', '}',
            '(', ')',
            '[', ']');

    public boolean isValid(String s) {
        if (s.length() % 2 == 1
                || isClosing(s.charAt(0))
                || isOpening(s.charAt(s.length() - 1))) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
            }

            if (isClosing(s.charAt(i))) {
                if (stack.empty()) {
                    return false;
                }
                Character fromString = s.charAt(i);
                Character fromStack = stack.peek();
                if (bracketsPair.get(fromStack).equals(fromString)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private boolean isOpening(char ch) {
        return openingBrackets.contains(ch);
    }

    private boolean isClosing(char ch) {
        return closingBrackets.contains(ch);
    }
}
