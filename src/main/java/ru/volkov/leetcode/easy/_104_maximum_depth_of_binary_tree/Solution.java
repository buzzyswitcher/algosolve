package ru.volkov.leetcode.easy._104_maximum_depth_of_binary_tree;

import ru.volkov.leetcode.common.TreeNode;

class Solution {

    public int maxDepth(TreeNode root) {
        return recursive(root);
    }

    private int recursive(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = recursive(node.left);
        int right = recursive(node.right);

        return 1 + Math.max(left, right);
    }
}
