package ru.volkov.hackerrank.contest.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSumMultipliesInSequence() {
        assertEquals(1683, Solution.sumMultipliesInSequence(100, 3, 3));
    }
}