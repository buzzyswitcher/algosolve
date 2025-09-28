package ru.volkov.leetcode.easy._112_path_sum;

import ru.volkov.leetcode.common.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return preorder(root, targetSum);
    }

    public boolean preorder(TreeNode node, int sum) {
        if (node == null) {
            return false;
        }

        int remainingSum = sum - node.val;
        if (remainingSum == 0 && node.left == null && node.right == null) {
            return true;
        }

        return preorder(node.left, remainingSum) || preorder(node.right, remainingSum);
    }
}
