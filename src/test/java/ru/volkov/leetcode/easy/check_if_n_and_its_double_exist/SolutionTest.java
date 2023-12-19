package ru.volkov.leetcode.easy.check_if_n_and_its_double_exist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkIfExist() {
        int[] arr = new int[]{10,2,5,3};

        assertTrue(new Solution().checkIfExist(arr));
    }

    @Test
    public void checkIfExist_2() {
        int[] arr = new int[]{3,1,7,11};

        assertFalse(new Solution().checkIfExist(arr));
    }

    @Test
    public void checkIfExist_3() {
        int[] arr = new int[]{0,0};

        assertTrue(new Solution().checkIfExist(arr));
    }

    @Test
    public void checkIfExist_4() {
        int[] arr = new int[]{-10,12,-20,-8,15};

        assertTrue(new Solution().checkIfExist(arr));
    }

    @Test
    public void checkIfExist_5() {
        int[] arr = new int[]{-2,0,10,-19,4,6,-8};

        assertFalse(new Solution().checkIfExist(arr));
    }
}