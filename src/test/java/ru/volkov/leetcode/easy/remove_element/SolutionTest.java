package ru.volkov.leetcode.easy.remove_element;

import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testRemoving() {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        Assert.assertEquals(5, new Solution().removeElement(nums, 2));
    }

}