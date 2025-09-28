package ru.volkov.leetcode.easy._101_symmetric_tree;

import org.junit.Assert;
import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {


        TreeNode L3_1 = new TreeNode("L3_1", 3, null, null);
        TreeNode L3_2 = new TreeNode("L3_2", 4, null, null);
        TreeNode L3_3 = new TreeNode("L3_3", 4, null, null);
        TreeNode L3_4 = new TreeNode("L3_4", 3, null, null);

        TreeNode L2_1 = new TreeNode("L2_1", 2, L3_1, L3_2);
        TreeNode L2_2 = new TreeNode("L2_2", 2, L3_3, L3_4);

        TreeNode root = new TreeNode("root", 1, L2_1, L2_2);

        Solution solution = new Solution();

        Assert.assertTrue(solution.isSymmetric(root));

    }

    @Test
    public void test_2() {


        TreeNode L3_1 = new TreeNode("L3_1", 3, null, null);
        TreeNode L3_2 = new TreeNode("L3_2", 3, null, null);

        TreeNode L2_1 = new TreeNode("L2_1", 2, null, L3_1);
        TreeNode L2_2 = new TreeNode("L2_2", 2, null, L3_2);

        TreeNode root = new TreeNode("root", 1, L2_1, L2_2);

        Solution solution = new Solution();

        Assert.assertFalse(solution.isSymmetric(root));

    }

    @Test
    public void test_3() {


        TreeNode L3_1 = new TreeNode("L3_1", 2, null, null);
        TreeNode L3_2 = new TreeNode("L3_2", 2, null, null);

        TreeNode L2_1 = new TreeNode("L2_1", 2, L3_1, null);
        TreeNode L2_2 = new TreeNode("L2_2", 2, L3_2, null);

        TreeNode root = new TreeNode("root", 1, L2_1, L2_2);

        Solution solution = new Solution();

        Assert.assertFalse(solution.isSymmetric(root));

    }
}