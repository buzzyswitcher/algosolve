package ru.volkov.leetcode.easy.remove_duplicates_from_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        int result = new Solution().removeDuplicates(nums);

        assertArrayEquals(new int[]{0,1,2,3,4,2,2,3,3,4}, nums);
        assertEquals(5, result);
    }

    @Test
    public void testRemoveDuplicates_2() {
        int[] nums = new int[]{1,1,2};

        int result = new Solution().removeDuplicates(nums);

        assertArrayEquals(new int[]{1,2,2}, nums);
        assertEquals(2, result);
    }

    @Test
    public void testRemoveDuplicates_3() {
        int[] nums = new int[]{1,2};

        int result = new Solution().removeDuplicates(nums);

        assertArrayEquals(new int[]{1,2}, nums);
        //assertEquals(2, result);
    }
}