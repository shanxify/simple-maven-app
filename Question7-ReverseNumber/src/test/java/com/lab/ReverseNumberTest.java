
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    ReverseNumber obj = new ReverseNumber();

    @Test
    void testReversePositiveNumber() {
        assertEquals(54321, obj.reverse(12345));
    }

    @Test
    void testReverseNumberWithZero() {
        assertEquals(3021, obj.reverse(1203));
    }

    @Test
    void testSingleDigit() {
        assertEquals(7, obj.reverse(7));
    }

    @Test
    void testZero() {
        assertEquals(0, obj.reverse(0));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-543, obj.reverse(-345));
    }
}
