package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_not_multiple_of_3_5(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.say(1);

        assertEquals("1",fizzbuzz.say(1));

    }

    @Test
    public void should_return_fizz_when_multiple_of_3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.say(3);

        assertEquals("Fizz",fizzbuzz.say(3));
    }

    @Test
    public void should_return_buzz_when_multiple_of_5(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.say(5);

        assertEquals("Buzz",fizzbuzz.say(5));
    }

    @Test
    public void should_return_fizzbuzz_when_multiple_of_3_5(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.say(15);

        assertEquals("FizzBuzz",fizzbuzz.say(15));
    }
}


