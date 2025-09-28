package ru.volkov.leetcode.medium.sort_colors;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        int[] array = new int[]{2,0,2,1,1,0};

        new Solution().sortColors(array);
    }

}