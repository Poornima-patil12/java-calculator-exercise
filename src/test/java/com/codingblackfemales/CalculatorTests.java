package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("Multiplication")
    public void testMultiplication() {
        final Integer mul = Calculator.multiply(4, 5);
        assertEquals(20, mul);
    }

    @Test
    @DisplayName("multiply a negative and positive number")
    public void testMultiplicationPosNeg() {
        final Integer product = Calculator.multiply(4, -3);

        assertEquals(-12, product);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationTwoNegatives() {
        final Integer product = Calculator.multiply(-6, -3);

        assertEquals(18, product);
    }

    @Test
    @DisplayName("divide 2 numbers")
    public void testDivideTwoNumbers() {
        final Float sum = Calculator.divide(-18, 3);
        assertEquals(-6, sum);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final Float divide = Calculator.divide(-8, -4);
        assertEquals(2, divide);
    }

    @Test
    @DisplayName("divide by zero")
    public void testDivisionZero() {
        assertEquals(Float.POSITIVE_INFINITY, Calculator.divide(16, 0));
        // assertThrows(ArithmeticException.class, () -> Calculator.divide(9,0));
    }

    @Test
    @DisplayName("Divide Two Positive Numbers")
    public void testDivideTwoPositiveNumbers() {
        final Float sum = Calculator.divide(50, 3);
        assertEquals(16.666666f, sum);
    }

    @Test
    @DisplayName("divide two numbers to return a Float")
    public void testDivisionFloat() {
        final Float divide = Calculator.divide(2, 4);
        assertEquals(0.5f, divide);
    }
}
