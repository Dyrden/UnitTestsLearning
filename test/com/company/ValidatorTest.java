package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {


    @Test
    void isEven() {
        //Arrange
        Validator validator = new Validator();

        //Act

        boolean actual = validator.isEven(5);
        //Assert
        assertTrue(actual);

    }

}