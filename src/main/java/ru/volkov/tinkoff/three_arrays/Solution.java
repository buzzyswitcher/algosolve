package ru.volkov.tinkoff.three_arrays;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Solution {

    public List<Integer> calculate(int[][] array) {

        List<BitSet> bitsetList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            int[] row = array[i];
            BitSet bitSet = new BitSet(10);
            for (int j = 0; j < row.length; j++) {
                int value = row[j];
                bitSet.set(value, true);
            }
            bitsetList.add(bitSet);
        }

        BitSet result = (BitSet) bitsetList.get(0).clone();

        for (BitSet bitSet : bitsetList) {
            result.and(bitSet);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = result.nextSetBit(0); i >= 0; i = result.nextSetBit(i + 1)) {
            resultList.add(i);
        }

        System.out.println(resultList);

        return resultList;
    }

}
