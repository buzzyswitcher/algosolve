package ru.volkov.hackerrank.datastructure.array.arrayds;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void getSumInWindowTest() {
        List<List<Integer>> initArray = new ArrayList<>();

        List<Integer> firstRow = Arrays.asList(1,1,1);
        List<Integer> secondRow = Arrays.asList(1,1,1);
        List<Integer> thirdRow = Arrays.asList(1,1,1);

        initArray.add(firstRow);
        initArray.add(secondRow);
        initArray.add(thirdRow);

        Assert.assertEquals(7, Result.getSumInWindow(initArray, 0, 0));
    }

    @Test
    public void getHourGlassSum() {
        List<List<Integer>> initArray = new ArrayList<>();

        List<Integer> one = Arrays.asList(1,1,1,0,0,0);
        List<Integer> two = Arrays.asList(0,1,0,0,0,0);
        List<Integer> three = Arrays.asList(1,1,1,0,0,0);
        List<Integer> four = Arrays.asList(0,0,2,4,4,0);
        List<Integer> five = Arrays.asList(0,0,0,2,0,0);
        List<Integer> six = Arrays.asList(0,0,1,2,4,0);

        initArray.add(one);
        initArray.add(two);
        initArray.add(three);
        initArray.add(four);
        initArray.add(five);
        initArray.add(six);

        Assert.assertEquals(19, Result.hourglassSum(initArray));
    }
}