package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        Assert.assertTrue(CheckPrimeNumber.check(5));
    }

    @Test
    public void when4() {
        Assert.assertFalse(CheckPrimeNumber.check(4));
    }

    @Test
    public void when1() {
        Assert.assertFalse(CheckPrimeNumber.check(1));
    }
}