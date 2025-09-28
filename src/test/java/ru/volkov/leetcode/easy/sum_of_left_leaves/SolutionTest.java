package ru.volkov.leetcode.easy.sum_of_left_leaves;

import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        TreeNode L3_1 = new TreeNode(15);
        TreeNode L3_2 = new TreeNode(7);

        TreeNode L2_1 = new TreeNode(9);
        TreeNode L2_2 = new TreeNode(20, L3_1, L3_2);

        TreeNode L1 = new TreeNode(3, L2_1, L2_2);

        Solution solution = new Solution();
        assertEquals(24, solution.sumOfLeftLeaves(L1));
    }
}