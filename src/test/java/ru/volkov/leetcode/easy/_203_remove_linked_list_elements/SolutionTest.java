package ru.volkov.leetcode.easy._203_remove_linked_list_elements;

import org.junit.Test;
import ru.volkov.leetcode.common.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeElements() {

        ListNode node_7 = new ListNode(6, null);
        ListNode node_6 = new ListNode(5, node_7);
        ListNode node_5 = new ListNode(4, node_6);
        ListNode node_4 = new ListNode(3, node_5);
        ListNode node_3 = new ListNode(6, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        Solution solution = new Solution();
        ListNode head = solution.removeElements(node_1, 6);
        System.out.println(head.printList());
    }

    @Test
    public void removeElements1() {

        ListNode node_4 = new ListNode(7, null);
        ListNode node_3 = new ListNode(7, node_4);
        ListNode node_2 = new ListNode(7, node_3);
        ListNode node_1 = new ListNode(7, node_2);

        Solution solution = new Solution();
        ListNode head = solution.removeElements(node_1, 7);
    }
}