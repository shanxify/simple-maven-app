package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Even", obj.checkNumber(10));
    }

    @Test
    void testOddNumber() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Odd", obj.checkNumber(7));
    }

    @Test
    void testZero() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Even", obj.checkNumber(0));
    }
}