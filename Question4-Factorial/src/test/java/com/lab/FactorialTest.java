
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void testFactorialOfFive() {
        Factorial obj = new Factorial();
        assertEquals(120L, obj.findFactorial(5));
    }

    @Test
    void testFactorialOfZero() {
        Factorial obj = new Factorial();
        assertEquals(1L, obj.findFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        Factorial obj = new Factorial();
        assertEquals(1L, obj.findFactorial(1));
    }

    @Test
    void testFactorialOfSix() {
        Factorial obj = new Factorial();
        assertEquals(720L, obj.findFactorial(6));
    }

    @Test
    void testNegativeNumber() {
        Factorial obj = new Factorial();
        assertThrows(IllegalArgumentException.class,
                () -> obj.findFactorial(-1));
    }
}
