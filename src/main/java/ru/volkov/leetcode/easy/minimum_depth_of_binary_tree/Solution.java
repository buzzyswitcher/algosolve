package ru.volkov.leetcode.easy.minimum_depth_of_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);

        int depth = 1;
        boolean isLevelHasLeaf = false;
        while (!treeNodes.isEmpty() && !isLevelHasLeaf) {

            for (int i = 0; i < treeNodes.size(); i++) {
                TreeNode current = treeNodes.poll();

                if (current.left == null && current.right == null) {
                    isLevelHasLeaf = true;
                }

                if (current.left != null) {
                    treeNodes.add(current.left);
                }

                if (current.right != null) {
                    treeNodes.add(current.right);
                }

            }
            depth++;
        }

        return depth;
    }
}
