package ru.volkov.leetcode.easy.middle_of_the_linkedlist;

import org.junit.Assert;
import org.junit.Test;
import ru.volkov.leetcode.common.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        Solution solution = new Solution();

        Assert.assertEquals(node3, solution.middleNode(node1));
    }
}