package com.example.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("นับ 1 ได้ 1")
    public void case_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(1);
        assertEquals("1", actualResult);
    }

    @Test
    @DisplayName("นับ 2 ได้ 2")
    public void case_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(2);
        assertEquals("2", actualResult);
    }
}
