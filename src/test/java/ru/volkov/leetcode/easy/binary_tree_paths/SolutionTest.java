package ru.volkov.leetcode.easy.binary_tree_paths;

import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        TreeNode L3_1 = new TreeNode(5);

        TreeNode L2_1 = new TreeNode(2, null, L3_1);
        TreeNode L2_2 = new TreeNode(3);

        TreeNode L1 = new TreeNode(1, L2_1, L2_2);

        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(L1));
    }
}