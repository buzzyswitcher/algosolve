package ru.volkov.leetcode.medium.binary_tree_level_order_traversal;

import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        TreeNode l3_1 = new TreeNode(2, null, null);
        TreeNode l3_2 = new TreeNode(6, null, null);
        TreeNode l3_3 = new TreeNode(8, null, null);

        TreeNode l2_1 = new TreeNode(3, l3_1, null);
        TreeNode l2_2 = new TreeNode(7, l3_2, l3_3);

        TreeNode root = new TreeNode(5, l2_1, l2_2);


        Solution solution = new Solution();
        solution.levelOrder(root);

    }
}