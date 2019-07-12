package me.daniel.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTwoIntegersTest {

    @Test
    public void test1() {
        assertEquals(-1073741824, DivideTwoIntegers.divide(-2147483648, 2));
    }
}