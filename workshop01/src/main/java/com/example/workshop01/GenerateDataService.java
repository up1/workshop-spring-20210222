package com.example.workshop01;

import java.util.Random;

public class GenerateDataService {
    public String getData() {
        String name = "somkiat";
        Random random = new Random();
        int number = random.nextInt(10);
        if(number >= 1 && number<= 10) {
            return name + number;
        }
        throw new RuntimeException("Number out of range !!");
    }
}
