package ru.volkov.leetcode.medium.swap_nodes_in_pairs;

import ru.volkov.leetcode.common.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        swap(head);

        System.out.println(head.printList());
        return head;
    }

    public void swap(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }

        if (node.next.next == null) {
            return;
        }

        swap(node.next.next);

        ListNode next = node.next.next;
        ListNode next_next = node.next;

        node.next = next;
        node.next.next = next_next;
    }
}
