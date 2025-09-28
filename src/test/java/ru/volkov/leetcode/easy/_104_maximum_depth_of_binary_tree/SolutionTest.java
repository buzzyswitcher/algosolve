package ru.volkov.leetcode.easy._104_maximum_depth_of_binary_tree;

import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        TreeNode L3_1 = new TreeNode(15, null, null);
        L3_1.name = "L3_1";
        TreeNode L3_2 = new TreeNode(7, null, null);
        L3_2.name = "L3_2";

        TreeNode L2_1 = new TreeNode(9, null, null);
        L2_1.name = "L2_1";
        TreeNode L2_2 = new TreeNode(20, L3_1, L3_2);
        L2_2.name = "L2_2";

        TreeNode root = new TreeNode(3, L2_1, L2_2);
        root.name = "ROOT";

        Solution solution = new Solution();

        assertEquals(3, solution.maxDepth(root));
    }
}