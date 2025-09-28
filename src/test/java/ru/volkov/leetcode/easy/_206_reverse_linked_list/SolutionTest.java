package ru.volkov.leetcode.easy._206_reverse_linked_list;

import org.junit.Test;
import ru.volkov.leetcode.common.ListNode;

public class SolutionTest {


    @Test
    public void test() {
        ListNode node_5 = new ListNode(5, null);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        Solution solution = new Solution();
        ListNode reverseList = solution.reverseList(node_1);
    }

    @Test
    public void test_shouldReverseIteratively() {
        ListNode node_5 = new ListNode(5, null);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        Solution solution = new Solution();
        ListNode reverseList = solution.reverseList(node_1);
    }
}