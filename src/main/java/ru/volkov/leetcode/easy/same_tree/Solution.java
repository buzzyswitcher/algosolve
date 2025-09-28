package ru.volkov.leetcode.easy.same_tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return treeFingerprintDFS(p).equals(treeFingerprintDFS(q));
    }

    private String treeFingerprint(TreeNode root) {
        List<Integer> fingerprint = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {

            TreeNode currentNode = queue.poll();
            fingerprint.add(currentNode.val);

            if (Objects.nonNull(currentNode.left)) {
                queue.add(currentNode.left);
            }

            if (Objects.nonNull(currentNode.right)) {
                queue.add(currentNode.right);
            }
        }

        return fingerprint.toString();
    }

    private String treeFingerprintDFS(TreeNode root) {
        List<Integer> fingerprint = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (stack.size() != 0) {

            TreeNode currentNode = stack.pop();
            fingerprint.add(currentNode.val);

            if (Objects.nonNull(currentNode.right)) {
                stack.add(currentNode.right);
            }

            if (Objects.nonNull(currentNode.left)) {
                stack.add(currentNode.left);
            }
        }

        System.out.println(fingerprint);

        return fingerprint.toString();
    }
}