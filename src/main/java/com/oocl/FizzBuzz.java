package com.oocl;

public class FizzBuzz {
    public String say(int Number){

        if(Number % 3 == 0){
            return "Fizz";
        }
        if(Number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(Number);
    }
}
