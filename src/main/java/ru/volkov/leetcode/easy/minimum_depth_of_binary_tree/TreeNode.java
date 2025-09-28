package ru.volkov.leetcode.easy.minimum_depth_of_binary_tree;

public class TreeNode {
    int val;
    String name;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Name - [%s] val - [%d]", name, val);
    }

}
