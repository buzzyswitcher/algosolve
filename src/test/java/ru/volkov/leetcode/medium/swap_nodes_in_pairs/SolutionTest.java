package ru.volkov.leetcode.medium.swap_nodes_in_pairs;

import org.junit.Test;
import ru.volkov.leetcode.common.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        ListNode node_7 = new ListNode(7);
        ListNode node_8 = new ListNode(8);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;
        node_6.next = node_7;
        node_7.next = node_8;

        Solution solution = new Solution();
        solution.swap(node_1);
    }
}