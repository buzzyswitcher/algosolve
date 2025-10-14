package ru.volkov.leetcode.easy._2379_minimum_recolors_to_get_k_consecutive_black_blocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumRecolors_WBBWWBBWBW() {
        String test = "WBBWWBBWBW";

        assertEquals(3, new Solution().minimumRecolors(test, 7));
    }

    @Test
    public void minimumRecolors_BWWWBB() {
        String test = "BWWWBB";
        assertEquals(3, new Solution().minimumRecolors(test, 6));
    }
}