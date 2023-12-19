package ru.volkov.hackerrank.contest.projecteuler;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = sumMultipliesInSequence(n - 1, 3, 3)
                    + sumMultipliesInSequence(n - 1, 5, 5)
                    - sumMultipliesInSequence(n - 1, 15, 15);
            System.out.println(result);
        }
    }

    public static int sumMultipliesInSequence(int number, int multiplier, int firstNumber) {
        int lastMultiple = (number / multiplier) * multiplier;
        int numberInSequence = (lastMultiple - firstNumber) / multiplier + 1;
        return (multiplier + lastMultiple) / 2 * numberInSequence;
    }
}
