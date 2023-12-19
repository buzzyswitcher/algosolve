package ru.volkov.hackerrank.datastructure.array.arrayds;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int result = Integer.MIN_VALUE;

        for (int x = 0; x < arr.get(0).size() - 2; x++) {
            for (int y = 0; y < arr.size() - 2; y++) {
                int windowSum = getSumInWindow(arr, x, y);

                if (result < windowSum) {
                    result = windowSum;
                }
            }
        }
        // Write your code here
        return result;
    }

    public static int getSumInWindow(List<List<Integer>> initialArr, int dx, int dy) {
        int result = 0;
        for (int y = dy; y < dy + 3; y++) {
            for (int x = dx; x < dx + 3; x++) {
                if (y == dy + 1 && (x == dx || x == dx + 2)) {
                    System.out.println(String.format("Skip: x = %d, y = %d", x, y));
                    continue;
                }

                System.out.println(String.format("Add to result: x = %d, y = %d", x, y));
                result = result + (initialArr.get(y).get(x));
            }
        }
        return result;
    }
}
