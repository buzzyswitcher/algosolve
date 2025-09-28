package ru.volkov.leetcode.easy.same_tree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {


        TreeNode r1_l3_1 = new TreeNode(4, null, null);
        r1_l3_1.setName("R1-L3-LEFT");
        TreeNode r1_l3_2 = new TreeNode(5, null, null);
        r1_l3_1.setName("R1-L3-RIGHT");
        TreeNode r1_l3_3 = new TreeNode(6, null, null);
        r1_l3_1.setName("R1-L4-RIGHT");

        TreeNode r1_l2_1 = new TreeNode(2, r1_l3_1, r1_l3_2);
        r1_l2_1.setName("R1-L2-LEFT");
        TreeNode r1_l2_2 = new TreeNode(3, null, r1_l3_3);
        r1_l2_1.setName("R1-L2-RIGHT");

        TreeNode r1 = new TreeNode(1, r1_l2_1, r1_l2_2);
        r1.setName("R1");


        TreeNode r2_l2_1 = new TreeNode(2, null, null);
        r2_l2_1.setName("R2-L2-LEFT");
        TreeNode r2_l2_2 = new TreeNode(3, null, null);
        r2_l2_1.setName("R1-L2-RIGHT");

        TreeNode r2 = new TreeNode(1, r2_l2_1, r2_l2_2);
        r2.setName("R1");

        Solution solution = new Solution();

        Assert.assertTrue(solution.isSameTree(r1, r2));
    }
}