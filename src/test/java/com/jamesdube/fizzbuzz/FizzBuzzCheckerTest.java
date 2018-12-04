package com.jamesdube.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCheckerTest {

    @Test
    public void itReturnsAFizzIfNumberIsDivisibleBy5(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("fizz",fizzBuzz.checkFizzBuzz(5));
        Assert.assertEquals("fizz",fizzBuzz.checkFizzBuzz(10));
    }

    @Test
    public void itReturnsABuzzIfNumberIsDivisibleBy7(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("buzz",fizzBuzz.checkFizzBuzz(7));
        Assert.assertEquals("buzz",fizzBuzz.checkFizzBuzz(14));
    }

    @Test
    public void itReturnsAFizzBuzzIfNumberIsDivisibleBy5And7(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("fizzbuzz",fizzBuzz.checkFizzBuzz(35));
        Assert.assertEquals("fizzbuzz",fizzBuzz.checkFizzBuzz(70));
    }

    @Test
    public void itReturnsANumberIfNumberIsNotDivisibleBy5Or7(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1",fizzBuzz.checkFizzBuzz(1));
        Assert.assertEquals("2",fizzBuzz.checkFizzBuzz(2));
        Assert.assertEquals("3",fizzBuzz.checkFizzBuzz(3));
        Assert.assertEquals("4",fizzBuzz.checkFizzBuzz(4));
        Assert.assertEquals("6",fizzBuzz.checkFizzBuzz(6));
    }
}
