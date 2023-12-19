package ru.volkov.leetcode.easy.squares_of_a_sorted_array;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squareInt = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squareInt[i] = nums[i] * nums[i];
        }

        if (nums.length == 1) {
            return squareInt;
        } else {
            Arrays.sort(squareInt);
        }

        return squareInt;
    }

    public static int[] trivialSolution(int[] nums) {
        int[] squareInt = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squareInt[i] = nums[i] * nums[i];
        }

        if (nums.length == 1) {
            return squareInt;
        } else {
            Arrays.sort(squareInt);
        }

        return squareInt;
    }

    public static int[] twoPointerSolution(int[] nums) {
        int[] sqArray = new int[nums.length];

        int rPoint = nums.length - 1;
        int lPoint = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int lSquare = nums[lPoint] * nums[lPoint];
            int rSquare = nums[rPoint] * nums[rPoint];

            if (rSquare > lSquare) {
                sqArray[i] = rSquare;
                rPoint--;
            }

            if (lSquare > rSquare) {
                sqArray[i] = lSquare;
                lPoint++;
            }

            if (lSquare == rSquare) {
                sqArray[i] = lSquare;
                lPoint++;
            }
        }

        return sqArray;
    }


}
