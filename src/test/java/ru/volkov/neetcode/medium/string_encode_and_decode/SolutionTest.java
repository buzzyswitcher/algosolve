package ru.volkov.neetcode.medium.string_encode_and_decode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void decode() {

        Solution solution = new Solution();
        String enc = solution.encode(List.of(""));

        List<String> decodeList = solution.decode(enc);

        System.out.println(decodeList);
    }
}