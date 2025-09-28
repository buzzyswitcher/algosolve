package ru.volkov.leetcode.easy.search_in_a_binary_search_tree;

import ru.volkov.leetcode.common.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        return searchRecursively(root, val);
    }

    public TreeNode searchRecursively(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.right == null && node.left == null && val != node.val) {
            return null;
        }

        TreeNode result = null;
        if (val == node.val) {
            result = node;
        } else if (val > node.val) {
            result = searchRecursively(node.right, val);
        } else {
            result = searchRecursively(node.left, val);
        }

        return result;
    }
}
