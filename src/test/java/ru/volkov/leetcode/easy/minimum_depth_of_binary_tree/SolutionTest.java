package ru.volkov.leetcode.easy.minimum_depth_of_binary_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {


        TreeNode L3_1 = new TreeNode(4, null, null);
        TreeNode L3_2 = new TreeNode(5, null, null);

        TreeNode L2_1 = new TreeNode(2, L3_1, L3_2);
        TreeNode L2_2 = new TreeNode(3, null, null);

        TreeNode root = new TreeNode(1, L2_1, L2_2);

        assertEquals(2, new Solution().minDepth(root));


    }
}