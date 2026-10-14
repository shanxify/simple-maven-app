
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PrimeNumberTest {

    @Test
    void testPrimeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertTrue(obj.isPrime(7));
    }

    @Test
    void testCompositeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(10));
    }

    @Test
    void testNumberOne() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(1));
    }

    @Test
    void testZero() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(0));
    }

    @Test
    void testNegativeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(-5));
    }

    @Test
    void testTwo() {
        PrimeNumber obj = new PrimeNumber();
        assertTrue(obj.isPrime(2));
    }
}
