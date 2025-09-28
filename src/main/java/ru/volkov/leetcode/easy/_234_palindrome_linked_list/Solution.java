package ru.volkov.leetcode.easy._234_palindrome_linked_list;

import ru.volkov.leetcode.common.ListNode;

import java.util.Stack;

public class Solution {

    private ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return isPalindromeRecursive(head);
    }

    private boolean isPalindromeRecursive(ListNode node) {
        if (node == null) {
            return true;
        }

        if (!isPalindromeRecursive(node.next)) {
            return false;
        }

        if (node.val == front.val) {
            front = front.next;
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeStack(ListNode head) {

        int size = getSize(head);

        ListNode node = head;
        int counter = 0;
        Stack<Integer> stack = new Stack<>();
        boolean isContinue = true;
        while (isContinue) {
            if (counter < size / 2) {
                stack.push(node.val);
            } else {
                if (stack.peek() == node.val) {
                    stack.pop();
                } else {
                    isContinue = false;
                }
            }
            counter ++;
            node = node.next;
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            size++;
        }

        return size;
    }
}
