package ru.volkov.leetcode.easy.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(list, root);
        return list;
    }

    private void inorder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(list, node.left);
        list.add(node.val);
        inorder(list, node.right);
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
