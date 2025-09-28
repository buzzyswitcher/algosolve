package ru.volkov.leetcode.medium.hand_of_straits;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {
//        if (hand.length % groupSize != 0) {
//            return false;
//        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : hand) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        Integer[] uniqueCards = freqMap.keySet().toArray(new Integer[0]);

        Arrays.sort(freqMap.keySet().toArray(uniqueCards));

        int maxGroup = hand.length / groupSize;
        for (Integer card : uniqueCards) {
            if (freqMap.get(card) == 0) {
                return false;
            }

        }


        System.out.println(freqMap);
        return true;
    }
}
