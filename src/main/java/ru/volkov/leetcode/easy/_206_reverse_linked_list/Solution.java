package ru.volkov.leetcode.easy._206_reverse_linked_list;

import ru.volkov.leetcode.common.ListNode;

import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode newList = reverseIter(head);

        return newList;
    }


    private ListNode reverse(ListNode current) {
        if (current == null || current.next == null) {
            return current;
        }

        ListNode head = reverse(current.next);
        current.next.next = current;
        current.next = null;

        return head;
    }

    private ListNode reverseIter(ListNode head) {

        if (head == null) {
            return head;
        }

        Stack<ListNode> stack = new Stack<>();
        stack.push(head);

        ListNode current = head.next;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode newHead = stack.pop();
        ListNode currentNode = newHead;
        ListNode nextNode;
        while (!stack.isEmpty()) {
            nextNode = stack.pop();
            currentNode.next = nextNode;
            currentNode = nextNode;
            nextNode.next = null;
        }

        return newHead;
    }

}