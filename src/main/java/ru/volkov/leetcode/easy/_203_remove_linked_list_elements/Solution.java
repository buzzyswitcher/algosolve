package ru.volkov.leetcode.easy._203_remove_linked_list_elements;


import ru.volkov.leetcode.common.ListNode;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        // Используем фиктивную голову
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Пропускаем узел
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
