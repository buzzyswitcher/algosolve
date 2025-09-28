package ru.volkov.leetcode.easy.crawler_log_folder;

import java.util.Stack;

class Solution {
    public int minOperations(String[] logs) {

        Stack<String> folders = new Stack<>();
        for (String s : logs) {
            if ("../".equals(s)) {
                if (!folders.isEmpty()) {
                    folders.pop();
                }
            } else if ("./".equals(s)) {
                continue;
            } else {
                folders.push(s);
            }
        }

        return folders.size();
    }
}
