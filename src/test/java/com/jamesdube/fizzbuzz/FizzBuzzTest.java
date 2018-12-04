package com.jamesdube.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void contextLoads(){

    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Test
    public void itEchosNumbersInAGivenRange(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.play(1,4);
        assertEquals("1 2 3 4 ", systemOutRule.getLog());

        systemOutRule.clearLog();

        fizzBuzz.play(16,19);
        assertEquals("16 17 18 19 ", systemOutRule.getLog());

    }

    @Test
    public void itEchosFizzOnNumbersDivisibleBy5(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.play(1,6);
        assertEquals("1 2 3 4 fizz 6 ", systemOutRule.getLog());

        systemOutRule.clearLog();

        fizzBuzz.play(9,13);
        assertEquals("9 fizz 11 12 13 ", systemOutRule.getLog());
    }

    @Test
    public void itEchosBuzzOnNumbersDivisibleBy7(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.play(6,8);
        assertEquals("6 buzz 8 ", systemOutRule.getLog());

        systemOutRule.clearLog();

        fizzBuzz.play(11,14);
        assertEquals("11 12 13 buzz ", systemOutRule.getLog());
    }

    @Test
    public void itEchosFizzBuzzOnNumbersDivisibleBy5And7(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.play(31,36);
        assertEquals("31 32 33 34 fizzbuzz 36 ", systemOutRule.getLog());

        systemOutRule.clearLog();

        fizzBuzz.play(66,72);
        assertEquals("66 67 68 69 fizzbuzz 71 72 ", systemOutRule.getLog());
    }
}
