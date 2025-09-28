package ru.volkov.leetcode.easy._119_pascal_triangle_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        return getRowRecursively(rowIndex);
    }

    private List<Integer> getRowRecursively(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }

        List<Integer> row = getRowRecursively(rowIndex - 1);

        List<Integer> nextRow = new ArrayList<>();

        // Добавляем 1 в начале массива
        nextRow.add(1);

        if (row.size() > 1) {
            for (int i = 0; i < row.size() - 1; i++) {
                nextRow.add(row.get(i) + row.get(i + 1));
            }
        }

        // Добавляем 1 в конце массива
        nextRow.add(1);

        return nextRow;
    }
}
