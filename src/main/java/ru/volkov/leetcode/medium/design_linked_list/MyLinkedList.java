package ru.volkov.leetcode.medium.design_linked_list;

import java.util.StringJoiner;

class MyLinkedList {

    int size = 0;
    Node head;
    Node tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index >= size) {
            return - 1;
        }
        return getNodeAt(index).val;
    }

    private Node getNodeAt(int index) {
        int idx = 0;
        Node currNode = head;
        while (idx < index) {
            currNode = currNode.next;
            idx++;
        }
        return currNode;
    }

    public void addAtHead(int val) {
        Node newNode = new Node();
        newNode.val = val;

        if (size == 0) {
            this.head = newNode;
            this.tail = newNode;
        }

        if (size > 0) {
            newNode.next = this.head;
            this.head = newNode;
        }

        this.size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }

        Node newTail = new Node(val);

        this.tail.next = newTail;
        this.tail = newTail;

        this.size++;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        boolean isTail = false;
        Node currNode = head;
        while (!isTail) {
            if (currNode.next == null) {
                isTail = true;
            }
            sj.add(currNode.val.toString());
            currNode = currNode.next;
        }
        return sj.toString();
    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        if (index > size) {
            return;
        }

        Node node = new Node(val);

        Node currNode = head;
        Node prev = null;
        int idx = 0;
        while (idx < index) {
            prev = currNode;
            currNode = currNode.next;
            idx++;
        }

        node.next = currNode;
        prev.next = node;

        this.size++;
    }

    public void deleteAtIndex(int index) {
        if (index > size - 1) {
            return;
        }

        if (index == 0) {
            Node unlink = head;
            this.head = head.next;

            unlink.next = null;
            unlink.val = null;

            this.size--;
            return;
        }

        if (index == size) {
            Node prevNode = getNodeAt(index - 1);
            Node deleteNode = tail;

            prevNode.next = null;
            tail = prevNode;

            deleteNode.next = null;
            deleteNode.val = null;

            this.size--;
        }

        Node prevNode = getNodeAt(index - 1);
        Node deleteNode = prevNode.next;

        prevNode.next = deleteNode.next;

        deleteNode.next = null;
        deleteNode.val = null;

        this.size--;
    }

    public static class Node {
        private Integer val = null;
        private Node next = null;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }

        public String toString() {
            return val.toString();
        }
    }
}
