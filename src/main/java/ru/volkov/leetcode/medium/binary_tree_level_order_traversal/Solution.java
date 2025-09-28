package ru.volkov.leetcode.medium.binary_tree_level_order_traversal;

import ru.volkov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();

            int nodeSize = nodes.size();

            for (int i = 0; i < nodeSize; i++){
                TreeNode currentNode = nodes.poll();
                levelList.add(currentNode.getVal());

                if (currentNode.getLeft() != null) {
                    nodes.add(currentNode.getLeft());
                }

                if (currentNode.getRight() != null) {
                    nodes.add(currentNode.getRight());
                }
            }

            list.add(levelList);

        }

        System.out.println(list);

        return list;
    }
}