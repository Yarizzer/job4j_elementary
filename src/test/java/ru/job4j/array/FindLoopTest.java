package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void when0123Search2Then2() {
        int[] data = new int[] {0, 1, 2, 3};
        int result = FindLoop.indexOf(data, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when098765Search6Then4() {
        int[] data = new int[] {0, 9, 8, 7, 6, 5};
        int result = FindLoop.indexOf(data, 6);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when0123Search6ThenMinusOne() {
        int[] data = new int[] {0, 1, 2, 3};
        int result = FindLoop.indexOf(data, 6);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}