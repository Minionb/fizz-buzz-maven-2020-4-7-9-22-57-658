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


}

