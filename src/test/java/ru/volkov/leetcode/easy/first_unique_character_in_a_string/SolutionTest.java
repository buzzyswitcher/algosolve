package ru.volkov.leetcode.easy.first_unique_character_in_a_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        String s = "loveleetcode";

        assertEquals(2, solution.firstUniqChar(s));
    }

    @Test
    public void test_2() {
        Solution solution = new Solution();
        String s = "leetcode";

        assertEquals(0, solution.firstUniqChar(s));
    }

    @Test
    public void test_3() {
        Solution solution = new Solution();
        String s = "aabb";

        assertEquals(-1, solution.firstUniqChar(s));
    }

}