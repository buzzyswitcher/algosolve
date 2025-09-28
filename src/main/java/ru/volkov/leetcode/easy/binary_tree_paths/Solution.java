package ru.volkov.leetcode.easy.binary_tree_paths;

import ru.volkov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }

        path(root, "", paths);
        return paths;
    }

    private void path(TreeNode node, String path, List<String> paths) {
        path = path + node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            if (node.left != null) {
                path(node.left, path + "->", paths);
            }
            if (node.right != null) {
                path(node.right, path + "->", paths);
            }
        }
    }
}
