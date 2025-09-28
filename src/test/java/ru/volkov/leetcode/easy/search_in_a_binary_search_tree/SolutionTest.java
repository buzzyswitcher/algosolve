package ru.volkov.leetcode.easy.search_in_a_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_2() {

        TreeNode L3_1 = new TreeNode(1, null, null);
        TreeNode L3_2 = new TreeNode(3, null, null);
        TreeNode L2_1 = new TreeNode(2, L3_1, L3_2);
        TreeNode L2_2 = new TreeNode(7, null, null);
        TreeNode root = new TreeNode(4, L2_1, L2_2);

        Solution solution = new Solution();
        TreeNode res = solution.searchBST(root, 2);
        Assert.assertEquals(2, res.val);
    }

    @Test
    public void should_return_null() {

        TreeNode L3_1 = new TreeNode(1, null, null);
        TreeNode L3_2 = new TreeNode(3, null, null);
        TreeNode L2_1 = new TreeNode(2, L3_1, L3_2);
        TreeNode L2_2 = new TreeNode(7, null, null);
        TreeNode root = new TreeNode(4, L2_1, L2_2);

        Solution solution = new Solution();
        TreeNode res = solution.searchBST(root, 5);
        Assert.assertNull(res);
    }

    @Test
    public void should_return_15() {

        TreeNode L4_1 = new TreeNode(15, null, null);
        TreeNode L3_1 = new TreeNode(30, L4_1, null);
        TreeNode L2_1 = new TreeNode(2, null, L3_1);
        TreeNode L2_2 = new TreeNode(93, null, null);
        TreeNode root = new TreeNode(62, L2_1, L2_2);

        Solution solution = new Solution();
        TreeNode res = solution.searchBST(root, 15);
        Assert.assertEquals(15, res.val);
    }
}