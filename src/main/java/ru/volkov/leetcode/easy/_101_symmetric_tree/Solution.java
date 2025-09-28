package ru.volkov.leetcode.easy._101_symmetric_tree;

import ru.volkov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        List<String> fingerPrint = new ArrayList<>();

        traverse(root, "ROOT", fingerPrint);

        if (fingerPrint.size() % 2 == 0) {
            return false;
        }

        System.out.println(fingerPrint);

        return isListSymmetric(fingerPrint);
    }

    private void traverse(TreeNode node, String side, List<String> fingerPrint) {
        if (node == null) {
            fingerPrint.add(side + "NULL");
            return;
        }

        traverse(node.left, "L", fingerPrint);

        fingerPrint.add(side + String.valueOf(node.val));

        traverse(node.right, "R", fingerPrint);
    }

    private boolean isListSymmetric(List<String> fingerPrint) {

        int middle = fingerPrint.size() / 2;

        int frnt = 0;
        int back = fingerPrint.size() - 1;
        int iter = 0;

        while (iter < middle) {
            String fst = fingerPrint.get(frnt);
            String sec = fingerPrint.get(back);

            System.out.println(fst + "_" + sec);
            if (fst.charAt(0) == sec.charAt(0)) {
                System.out.println("side check - false");
                return false;
            }

            if (!fst.substring(1).equals(sec.substring(1))) {
                System.out.println("value check - false");
                return false;
            }

            frnt++;
            back--;
            iter++;
        }

        return true;
    }
}
