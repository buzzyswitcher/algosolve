package ru.volkov.leetcode.easy.find_all_duplicates_in_an_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {

        int[] nums = new int[]{4,3,2,7,8,2,3,1};

        Solution solution = new Solution();
        System.out.println(solution.findDuplicates(nums));
    }
}