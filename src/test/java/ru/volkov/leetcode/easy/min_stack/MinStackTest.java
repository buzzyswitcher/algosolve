package ru.volkov.leetcode.easy.min_stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {


    @Test
    public void test() {
        MinStack minStack = new MinStack();

        minStack.pull(-2);
        minStack.pull(0);
        minStack.pull(-3);
        minStack.pull(-5);
        minStack.pull(8);
        minStack.pull(6);
    }
}