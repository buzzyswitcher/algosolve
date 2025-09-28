package ru.volkov.leetcode.medium.n_ary_tree_level_order_traversal;

import org.junit.Test;
import ru.volkov.leetcode.common.NaryTreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        //LEVEL - 5
        NaryTreeNode l5_1 = new NaryTreeNode(14);

        //LEVEL - 4
        List<NaryTreeNode> l4_1_children = new ArrayList<>();
        l4_1_children.add(l5_1);
        NaryTreeNode l4_1 = new NaryTreeNode(11, l4_1_children);

        NaryTreeNode l4_2 = new NaryTreeNode(12);
        NaryTreeNode l4_3 = new NaryTreeNode(13);

        //LEVEL-3
        NaryTreeNode l3_1 = new NaryTreeNode(6);

        List<NaryTreeNode> l3_2_children = new ArrayList<>();
        l3_2_children.add(l4_1);
        NaryTreeNode l3_2 = new NaryTreeNode(7, l3_2_children);

        List<NaryTreeNode> l3_3_children = new ArrayList<>();
        l3_3_children.add(l4_2);
        NaryTreeNode l3_3 = new NaryTreeNode(8, l3_3_children);

        List<NaryTreeNode> l3_4_children = new ArrayList<>();
        l3_4_children.add(l4_3);
        NaryTreeNode l3_4 = new NaryTreeNode(9, l3_4_children);

        NaryTreeNode l3_5 = new NaryTreeNode(10);

        //LEVEL 2
        NaryTreeNode l2_1 = new NaryTreeNode(2);

        List<NaryTreeNode> l2_2_children = new ArrayList<>();
        l2_2_children.add(l3_1);
        l2_2_children.add(l3_2);
        NaryTreeNode l2_2 = new NaryTreeNode(3, l2_2_children);

        List<NaryTreeNode> l2_3_children = new ArrayList<>();
        l2_3_children.add(l3_3);
        NaryTreeNode l2_3 = new NaryTreeNode(4, l2_3_children);

        List<NaryTreeNode> l2_4_children = new ArrayList<>();
        l2_4_children.add(l3_4);
        l2_4_children.add(l3_5);
        NaryTreeNode l2_4 = new NaryTreeNode(3, l2_4_children);

        List<NaryTreeNode> root_children = new ArrayList<>();
        root_children.add(l2_1);
        root_children.add(l2_2);
        root_children.add(l2_3);
        root_children.add(l2_4);
        NaryTreeNode root = new NaryTreeNode(1, root_children);

        Solution solution = new Solution();
        solution.levelOrder(root);

    }

}