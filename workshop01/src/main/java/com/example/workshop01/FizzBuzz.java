package com.example.workshop01;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        return "" + number;
    }
}
