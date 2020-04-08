package com.oocl;

public class FizzBuzz {

    public String say(int Number) {
        String message = "";
        if (Number % 3 == 0) {
            message += "Fizz";

        }

        if (Number % 5 == 0) {
            message += "Buzz";

        }

        return message.equals("") ? String.valueOf(Number) : message;
    }
}
