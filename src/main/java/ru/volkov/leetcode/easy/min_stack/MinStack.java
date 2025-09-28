package ru.volkov.leetcode.easy.min_stack;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {

    private LinkedList<Integer> minValueQueue = new LinkedList<>();
    private Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public int getMin() {
        return minValueQueue.getFirst();
    }

    public void pull(int val) {
        if (minValueQueue.isEmpty()) {
            minValueQueue.addFirst(val);
        } else {
            int currentMin = minValueQueue.peekFirst();
            if (val < currentMin) {
                minValueQueue.addFirst(val);
            } else {
                minValueQueue.add(val);
            }
        }

        stack.push(val);
    }

    public int pop() {
        int toReturn = stack.peek();
        minValueQueue.remove(toReturn);
        return stack.pop();
    }
}
