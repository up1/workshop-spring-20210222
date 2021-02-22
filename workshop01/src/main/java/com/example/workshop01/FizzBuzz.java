package com.example.workshop01;


public class FizzBuzz {

    public String say(int number) {
        if(หารสามลงตัวไหม(number) && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        if(หารสามลงตัวไหม(number)) {
            return "Fizz";
        }
        return "" + number;
    }

    private boolean หารสามลงตัวไหม(int number) {
        return number % 3 == 0;
    }
}
