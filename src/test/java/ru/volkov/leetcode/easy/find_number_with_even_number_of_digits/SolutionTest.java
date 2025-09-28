package ru.volkov.leetcode.easy.find_number_with_even_number_of_digits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void should_return_2() {

        int[] arr = new int[]{12,345,2,6,7896};

        Solution solution = new Solution();
        assertEquals(2, solution.findNumbers(arr));
    }

    @Test
    public void should_return_0() {

        int[] arr = new int[]{1,2,3,4,5};

        Solution solution = new Solution();
        assertEquals(0, solution.findNumbers(arr));
    }

    @Test
    public void should_return_5() {

        int[] arr = new int[]{10,10,10,10,10};

        Solution solution = new Solution();
        assertEquals(5, solution.findNumbers(arr));
    }
}