package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {
    @Test
    public void when5() {
        Assert.assertEquals(3, PrimeNumber.calc(5));
    }

    @Test
    public void when11() {
        Assert.assertEquals(5, PrimeNumber.calc(11));
    }

    @Test
    public void when2() {
        Assert.assertEquals(1, PrimeNumber.calc(2));
    }
}