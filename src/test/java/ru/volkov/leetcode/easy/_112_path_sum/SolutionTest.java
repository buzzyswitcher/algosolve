package ru.volkov.leetcode.easy._112_path_sum;

import org.junit.Test;
import ru.volkov.leetcode.common.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        TreeNode L4_1 = new TreeNode(7);
        L4_1.name = "L4_1";
        TreeNode L4_2 = new TreeNode(2);
        L4_2.name = "L4_2";
        TreeNode L4_3 = new TreeNode(1);
        L4_3.name = "L4_3";

        TreeNode L3_1 = new TreeNode(11, L4_1, L4_2);
        L3_1.name = "L3_1";
        TreeNode L3_2 = new TreeNode(13);
        L3_2.name = "L3_2";
        TreeNode L3_3 = new TreeNode(4, null, L4_3);
        L3_3.name = "L3_3";

        TreeNode L2_1 = new TreeNode(4, L3_1, null);
        L2_1.name = "L2_1";
        TreeNode L2_2 = new TreeNode(8, L3_2, L3_3);
        L2_2.name = "L2_2";

        TreeNode L1 = new TreeNode(5, L2_1, L2_2);
        L1.name = "L1";

        Solution solution = new Solution();
        assertTrue(solution.hasPathSum(L1, 22));

    }
}