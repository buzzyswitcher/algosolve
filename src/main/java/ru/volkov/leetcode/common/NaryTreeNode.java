package ru.volkov.leetcode.common;

import java.util.List;

public class NaryTreeNode {

    int val;
    List<NaryTreeNode> children;

    public NaryTreeNode() {}

    public NaryTreeNode(int val) {
        this.val = val;
    }

    public NaryTreeNode(int val, List<NaryTreeNode> children) {
        this.val = val;
        this.children = children;
    }

    public List<NaryTreeNode> getChildren() {
        return children;
    }

    public int getVal() {
        return val;
    }
}
