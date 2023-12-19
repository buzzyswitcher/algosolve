package ru.volkov.leetcode.easy.replace_elements_with_greatest_element_on_right_side;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testReplaceElements() {
        int[] arr = new int[]{400};
        assertArrayEquals(new int[]{-1}, new Solution().replaceElements(arr));
    }

    @Test
    public void testReplaceElements_2() {
        int[] arr = new int[]{17,18,5,4,6,1};
        assertArrayEquals(new int[]{18,6,6,6,1,-1}, new Solution().replaceElements(arr));
    }
}