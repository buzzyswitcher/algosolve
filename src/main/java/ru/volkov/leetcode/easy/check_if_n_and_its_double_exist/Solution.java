package ru.volkov.leetcode.easy.check_if_n_and_its_double_exist;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkIfExist(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2) && map.get(arr[i] / 2) != i) {
                return true;
            }
        }
        return false;
    }
}