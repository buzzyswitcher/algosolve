package ru.volkov.leetcode.easy.find_numbers_with_even_number_of_digits;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testEvenOdd() {
        assertEquals(3, Solution.calculateNumberOfDigits(100));
        assertEquals(2, Solution.calculateNumberOfDigits(10));
        assertEquals(1, Solution.calculateNumberOfDigits(1));
    }
}