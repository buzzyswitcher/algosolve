package ru.volkov.leetcode.medium.design_linked_list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void get_when_list_consist_of_single_element() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        System.out.println(list.toString());
        Assert.assertEquals(1, list.get(0));
    }

    @Test
    public void get_when_list_consist_of_four_elements() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        System.out.println(list.toString());
        Assert.assertEquals(2, list.get(1));
    }

    @Test
    public void get_when_index_is_invalid() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        System.out.println(list.toString());
        Assert.assertEquals(-1, list.get(3));
    }

    @Test
    public void testAddAtHead_when_list_is_empty() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        System.out.println(list.toString());
        Assert.assertEquals("[1]", list.toString());
        Assert.assertEquals(1, list.size);
    }

    @Test
    public void testAddAtHead_when_list_is_not_empty() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        System.out.println(list.toString());
        Assert.assertEquals("[3, 2, 1]", list.toString());
        Assert.assertEquals(3, list.size);
    }

    @Test
    public void addAtTail_when_list_is_empty() {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        System.out.println(list.toString());
        Assert.assertEquals("[1]", list.toString());
        Assert.assertEquals(1, list.size);
    }

    @Test
    public void addAtTail_when_list_is_not_empty() {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtHead(2);
        list.addAtTail(3);
        System.out.println(list.toString());
        Assert.assertEquals("[2, 1, 3]", list.toString());
        Assert.assertEquals(3, list.size);
    }

    @Test
    public void addAtTail_when_list_is_not_empty_2() {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        System.out.println(list.toString());
        Assert.assertEquals("[1, 2, 3]", list.toString());
        Assert.assertEquals(3, list.size);
    }


    @Test
    public void addAtIndex_when_list_consist_of_two_elements() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtIndex(1,4);
        System.out.println(list.toString());
        assertEquals(4, list.get(1));
    }

    @Test
    public void addAtIndex_when_list_is_empty() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0,4);
        System.out.println(list.toString());
        assertEquals(4, list.get(0));
    }

    @Test
    public void addAtIndex_when_index_is_last_element() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.addAtIndex(3,5);
        assertEquals(5, list.get(3));
        System.out.println(list.toString());
    }
    @Test
    public void addAtIndex_when_index_is_invalid() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.addAtIndex(5,5);
        assertEquals(4, list.size);
        System.out.println(list.toString());
    }


    @Test
    public void deleteAtIndex_0() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.deleteAtIndex(0);
        assertEquals(2, list.get(0));
        System.out.println(list.toString());
    }

    @Test
    public void deleteAtIndex_1() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.deleteAtIndex(1);
        assertEquals(3, list.get(1));
        System.out.println(list.toString());
    }

    @Test
    public void deleteAtIndex_index_is_invalid() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.deleteAtIndex(4);
        assertEquals(4, list.size);
        System.out.println(list.toString());
    }

    @Test
    public void deleteAtIndex_delete_last_index() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3,4);
        list.deleteAtIndex(3);
        assertEquals(3, list.size);
        System.out.println(list.toString());
    }

    @Test
    public void leetcode_1() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(2);
        list.deleteAtIndex(7);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);
        list.addAtTail(5);
        list.get(5);
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);
    }

    @Test
    public void leetcode_2() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(84);
        list.addAtTail(2);
        list.addAtTail(39);
        list.get(3);
        list.get(1);
        list.addAtTail(42);
        list.addAtIndex(1,80);
        list.addAtHead(14);
        list.addAtHead(1);
        list.addAtTail(53);
        list.addAtTail(98);
        list.addAtTail(19);
        list.addAtTail(12);
        list.get(2);
        list.addAtHead(16);
        list.addAtHead(33);
        list.addAtIndex(4,17);
        list.addAtIndex(6,8);
        list.addAtHead(37);
        list.addAtTail(43);
        list.deleteAtIndex(11);
        list.addAtHead(80);
        list.addAtHead(31);
        list.addAtIndex(13,23);
        list.addAtTail(17);
        list.get(4);
        list.addAtIndex(10,0);
        list.addAtTail(21);
        list.addAtHead(73);
        list.addAtHead(22);
        list.addAtIndex(24,37);
        list.addAtTail(14);
        list.addAtHead(97);
        list.addAtHead(8);
        list.get(6);
        list.deleteAtIndex(17);
        list.addAtTail(50);
        list.addAtTail(28);
        list.addAtHead(76);
        list.addAtTail(79);
        list.get(18);
        list.deleteAtIndex(30);
        list.addAtTail(5);
        list.addAtHead(9);
        list.addAtTail(83);
        list.deleteAtIndex(3);
        list.addAtTail(40);
        list.deleteAtIndex(26);
        list.addAtIndex(20,90);
        list.deleteAtIndex(30);
        list.addAtTail(40);
        list.addAtHead(56);
        list.addAtIndex(15,23);
        list.addAtHead(51);
        list.addAtHead(21);
        list.get(26);
        list.addAtHead(83);
        list.get(30);
        list.addAtHead(12);
        list.deleteAtIndex(8);
        list.get(4);
        list.addAtHead(20);
        list.addAtTail(45);
        list.get(10);
        list.addAtHead(56);
        list.get(18);
        list.addAtTail(33);
        list.get(2);
        list.addAtTail(70);
        list.addAtHead(57);
        list.addAtIndex(31,24);
        list.addAtIndex(16,92);
        list.addAtHead(40);
        list.addAtHead(23);
        list.deleteAtIndex(26);
        list.get(1);
        list.addAtHead(92);
        list.addAtIndex(3,78);
        list.addAtTail(42);
        list.get(18);
        list.addAtIndex(39,9);
        list.get(13);
        list.addAtIndex(33,17);
        list.get(51);
        list.addAtIndex(18,95);
        list.addAtIndex(18,33);
        list.addAtHead(80);
        list.addAtHead(21);
        list.addAtTail(7);
        list.addAtIndex(17,46);
        list.get(33);
        list.addAtHead(60);
        list.addAtTail(26);
        list.addAtTail(4);
        list.addAtHead(9);
        list.get(45);
        list.addAtTail(38);
        list.addAtHead(95);
        list.addAtTail(78);
        list.get(54);
        list.addAtIndex(42,86);

    }
}