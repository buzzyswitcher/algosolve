package ru.volkov.leetcode.easy.middle_of_the_linkedlist;

import ru.volkov.leetcode.common.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {

        if (head.next == null) {
            return head;
        }

        ListNode tortoise = head;
        ListNode hare = head;

        boolean isFinished = false;
        while (!isFinished) {
            if (hare.next == null || hare.next.next == null) {
                break;
            }

            if (hare.next.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
            }
        }

        if (hare.next == null) {
            return tortoise;
        } else {
            return tortoise.next;
        }

    }
}
