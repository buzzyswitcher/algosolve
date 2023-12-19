package ru.volkov.leetcode.easy.squares_of_a_sorted_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSquareArray() {
        Solution solution = new Solution();
        int[] nums = new int[]{-4,-1,0,3,10};

        assertArrayEquals(new int[]{0,1,9,16,100}, solution.sortedSquares(nums));
    }

    @Test
    public void testTwoPointerSolution() {
        Solution solution = new Solution();
        int[] nums = new int[]{-4,-1,0,3,10};

        assertArrayEquals(new int[]{0,1,9,16,100}, Solution.twoPointerSolution(nums));

    }
}