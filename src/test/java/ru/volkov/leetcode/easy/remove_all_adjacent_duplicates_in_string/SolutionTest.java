package ru.volkov.leetcode.easy.remove_all_adjacent_duplicates_in_string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_ca() {
        Solution solution = new Solution();
        Assert.assertEquals("ca", solution.removeDuplicates("abbaca"));
    }

    @Test
    public void should_return_ay() {
        Solution solution = new Solution();
        Assert.assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }

}