package ru.volkov.tinkoff.three_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        int[] arr1 = new int[]{1,2,4,5,8,0,9};
        int[] arr2 = new int[]{3,3,4,4,7,0};
        int[] arr3 = new int[]{4};

        int[][] general = new int[3][];
        general[0] = arr1;
        general[1] = arr2;
        general[2] = arr3;

        Solution solution = new Solution();

        solution.calculate(general);
    }
}