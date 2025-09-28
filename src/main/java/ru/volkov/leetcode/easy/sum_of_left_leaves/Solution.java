package ru.volkov.leetcode.easy.sum_of_left_leaves;

import ru.volkov.leetcode.common.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sum(root, false);
    }

    public int sum(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null && isLeft) {
            return node.val;
        }

        return sum(node.left, true) + sum(node.right, false);
    }
}
