package ru.volkov.leetcode.easy.find_all_numbers_disappeared_in_an_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};

        System.out.println(new Solution().findDisappearedNumbers(nums));
    }
}