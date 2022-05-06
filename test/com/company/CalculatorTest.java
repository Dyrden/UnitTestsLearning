package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {



    @Test
    void sumPositiveNumbers() {

        //ARRANGE
        Calculator cal = new Calculator();

        //ACT
        double actual = cal.sum(1,2);

        //ASSERT
        double expected = 3;
        assertEquals(expected,actual);

    }

    @Test
    void sumNegativeNumbers() {

        //ARRANGE
        Calculator cal = new Calculator();

        //ACT
        double actual = cal.sum(-1,-5);

        //ASSERT
        double expected = -6;
        assertEquals(expected,actual);


    }

    @Test
    void sumTooLargeNumbers() {

        //ARRANGE
        Calculator cal = new Calculator();

        //ACT & ASSERT
        assertThrows(IllegalArgumentException.class,() -> cal.sum(101,50));

    }

    @Test
    void sumVeryLargeNumbers() {

        //ARRANGE
        Calculator cal = new Calculator();

        //ACT & ASSERT
        assertThrows(IllegalArgumentException.class,() -> cal.sum(Integer.MAX_VALUE,Integer.MAX_VALUE));

    }
}