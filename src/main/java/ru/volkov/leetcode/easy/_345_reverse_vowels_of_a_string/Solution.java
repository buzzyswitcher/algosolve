package ru.volkov.leetcode.easy._345_reverse_vowels_of_a_string;

class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right) {

            if (isVowel(arr[left])) {
                while (left < right) {
                    if (isVowel(arr[right])) {
                        char temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        right --;
                        break;
                    }
                    right --;
                }
                left ++;
                continue;
            }

            if (isVowel(arr[right])) {
                while (left < right) {
                    if (isVowel(arr[left])) {
                        char temp = arr[right];
                        arr[right] = arr[left];
                        arr[left] = temp;
                        left++;
                        break;
                    }
                    left ++;
                }
                right --;
                continue;
            }

            left ++;
            right --;
        }

        return String.valueOf(arr);
    }

    private boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return "aeiou".indexOf(ch) != -1;
    }
}
