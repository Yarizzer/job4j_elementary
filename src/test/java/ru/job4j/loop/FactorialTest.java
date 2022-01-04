package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Converter;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Assert.assertEquals(120, Factorial.calc(5));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Assert.assertEquals(1, Factorial.calc(0));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        Assert.assertEquals(1, Factorial.calc(1));
    }
}