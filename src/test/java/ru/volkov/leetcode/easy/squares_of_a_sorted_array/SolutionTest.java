package ru.volkov.leetcode.easy.squares_of_a_sorted_array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        int[] array = new int[]{-4,-1,0,3,10};

        System.out.println(Arrays.toString(new Solution().sortedSquares(array)));
    }

}