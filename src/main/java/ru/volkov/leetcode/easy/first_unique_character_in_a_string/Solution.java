package ru.volkov.leetcode.easy.first_unique_character_in_a_string;

public class Solution {

    public int firstUniqChar(String s) {

        int asciiOffset = 97;
        int[] frequencyArray = new int[26];

        for (char ch : s.toCharArray()) {
            int index = (int)ch - asciiOffset;
            frequencyArray[index] = frequencyArray[index] + 1;
        }

        for (char ch : s.toCharArray()) {
            int freq = frequencyArray[(int)ch - asciiOffset];
            if (freq == 1) {
                return s.indexOf(ch);
            }
        }

        return -1;
    }
}
