
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestTest {

    SimpleInterest obj = new SimpleInterest();

    @Test
    void testSimpleInterest() {
        assertEquals(1000.0, obj.calculate(10000, 5, 2), 0.001);
    }

    @Test
    void testZeroPrincipal() {
        assertEquals(0.0, obj.calculate(0, 5, 2), 0.001);
    }

    @Test
    void testZeroRate() {
        assertEquals(0.0, obj.calculate(10000, 0, 2), 0.001);
    }

    @Test
    void testZeroTime() {
        assertEquals(0.0, obj.calculate(10000, 5, 0), 0.001);
    }

    @Test
    void testNegativeValue() {
        assertThrows(
            IllegalArgumentException.class,
            () -> obj.calculate(-1000, 5, 2)
        );
    }
}
