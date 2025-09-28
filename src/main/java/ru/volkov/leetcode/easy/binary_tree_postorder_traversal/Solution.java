package ru.volkov.leetcode.easy.binary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(list, root);
        return list;
    }

    private void postorder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }

        postorder(list, node.left);
        postorder(list, node.right);
        list.add(node.val);
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