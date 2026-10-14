
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testFirstTenTerms() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
            fibonacci.generateSeries(10)
        );
    }

    @Test
    void testSingleTerm() {
        assertArrayEquals(
            new int[]{0},
            fibonacci.generateSeries(1)
        );
    }

    @Test
    void testTwoTerms() {
        assertArrayEquals(
            new int[]{0, 1},
            fibonacci.generateSeries(2)
        );
    }

    @Test
    void testZeroTerms() {
        assertArrayEquals(
            new int[]{},
            fibonacci.generateSeries(0)
        );
    }

    @Test
    void testNegativeTerms() {
        assertThrows(
            IllegalArgumentException.class,
            () -> fibonacci.generateSeries(-1)
        );
    }
}
