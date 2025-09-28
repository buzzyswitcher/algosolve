package ru.volkov.leetcode.easy._557_reverse_string_III;

class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            String word = sArr[i];

            char[] wordArray = word.toCharArray();
            int first = 0;
            int last = wordArray.length - 1;
            while (first < last) {
                char temp = wordArray[first];
                wordArray[first] = wordArray[last];
                wordArray[last] = temp;
                first ++;
                last --;
            }

            sArr[i] = new String(wordArray);
        }

        return String.join(" ", sArr);
    }
}
