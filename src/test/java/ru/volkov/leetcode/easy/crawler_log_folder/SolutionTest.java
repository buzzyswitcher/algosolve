package ru.volkov.leetcode.easy.crawler_log_folder;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        String[] arr = new String[] {"d1/","d2/","../","d21/","./"};

        Solution solution = new Solution();
        Assert.assertEquals(2, solution.minOperations(arr));
     }

    @Test
    public void test_1() {
        String[] arr = new String[] {"d1/","d2/","./","d3/","../","d31/"};

        Solution solution = new Solution();
        Assert.assertEquals(3, solution.minOperations(arr));
    }

    @Test
    public void test_2() {
        String[] arr = new String[] {"d1/","../","../","../"};

        Solution solution = new Solution();
        Assert.assertEquals(0, solution.minOperations(arr));
    }

    @Test
    public void test_3() {
        String[] arr = new String[] {"./","../","./"};

        Solution solution = new Solution();
        Assert.assertEquals(0, solution.minOperations(arr));
    }



}