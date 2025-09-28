package ru.volkov.leetcode.common;


import java.util.StringJoiner;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public String toString() {
        return String.format("Node - [%d]", val);
    }

    public String printList() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        ListNode current = this;
        while (current != null) {
            joiner.add(String.valueOf(current.val));
            current = current.next;
        }
        return joiner.toString();
    }
}
