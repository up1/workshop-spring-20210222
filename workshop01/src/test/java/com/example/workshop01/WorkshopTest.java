package com.example.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkshopTest {

    class Random8 extends Random{
        @Override
        public int nextInt(int bound) {
            return 8;
        }
    }

    @Test
    public void second_case() {
        GenerateDataService g = new GenerateDataService();
        String result = g.getData(new Random8());
        assertEquals("somkiat8", result);
    }

    @Test
    @DisplayName("สวัสดี junit 5 นะ")
    public void first_case() {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        assertEquals("Hello somkiat", result);
    }

}
