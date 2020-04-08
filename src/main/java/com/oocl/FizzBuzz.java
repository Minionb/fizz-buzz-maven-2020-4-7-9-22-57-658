package com.oocl;

public class FizzBuzz {
    public String say(int Number){

        if(Number % 3 == 0){
            return "Fizz";
        }

        return String.valueOf(Number);
    }
}
