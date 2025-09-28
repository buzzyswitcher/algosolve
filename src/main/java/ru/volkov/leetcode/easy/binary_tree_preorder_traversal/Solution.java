package ru.volkov.leetcode.easy.binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        return list;
    }

    private void preorder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }

        list.add(node.val);

        preorder(list, node.left);
        preorder(list, node.right);
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
