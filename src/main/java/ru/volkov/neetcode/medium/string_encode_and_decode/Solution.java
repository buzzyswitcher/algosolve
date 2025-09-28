package ru.volkov.neetcode.medium.string_encode_and_decode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        char[] sArr = str.toCharArray();

        StringBuilder length = new StringBuilder();
        Integer wordLength = 0;
        StringBuilder word = new StringBuilder();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < sArr.length;) {

            if ((int) sArr[i] > 47 && (int) sArr[i] < 58) {
                length.append(sArr[i]);
                i++;
                continue;
            }

            if ((int) sArr[i] == 35) {
                wordLength = Integer.valueOf(length.toString());
                i++;
                length.setLength(0);
                continue;
            }

            for (int j = i; j < i + wordLength; j++) {
                word.append(sArr[j]);
            }

            i = i + wordLength;

            words.add(word.toString());
            word.setLength(0);
        }

        return words;
    }
}

