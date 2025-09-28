package ru.volkov.leetcode.medium.n_ary_tree_level_order_traversal;

import ru.volkov.leetcode.common.NaryTreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> levelOrder(NaryTreeNode root) {
        Queue<NaryTreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);

        List<Integer> rootVals = new ArrayList<>();

        while (!nodes.isEmpty()) {
            int nodesToHandle = nodes.size();

            NaryTreeNode current = nodes.poll();
            rootVals.add(current.getVal());
            if (current.getChildren() != null) {
                for (NaryTreeNode node : current.getChildren()) {
                    nodes.add(node);
                }
            }

        }

        System.out.println(rootVals.toString());
        return rootVals;
    }
}
