package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {


    @Test
    void isEvenEvenNumber() {
        //Arrange
        Validator validator = new Validator();

        //Act

        boolean actual = validator.isEven(6);
        //Assert
        assertTrue(actual);

    }
    @Test
    void isEvenOddNumber() {
        //Arrange
        Validator validator = new Validator();

        //Act

        boolean actual = validator.isEven(5);
        //Assert
        assertFalse(actual);
    }

}