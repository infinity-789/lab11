package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test

    void testAddition() {
        assertEquals(4, calc.add(2, 2));
    }

    // @Test
    // void testSubtraction() {
    //     assertEquals(0, calc.sub(2, 2));
    // }

    @Test
    void testMultiplication() {
        assertEquals(4, calc.mul(2, 2));
    }

    @Test
    void testDivision() {
        assertEquals(1, calc.div(2, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.div(10,0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
