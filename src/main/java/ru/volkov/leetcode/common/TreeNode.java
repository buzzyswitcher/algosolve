package ru.volkov.leetcode.common;

public class TreeNode {

    public String name;
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(String name, int val, TreeNode left, TreeNode right) {
        this.name = name;
        this.val = val;
        this.left = left;
        this.right = right;
    }



    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getVal() {
        return val;
    }

    public String toString() {
        return String.format("[%s] - [%d]", name, val);
    }
}
