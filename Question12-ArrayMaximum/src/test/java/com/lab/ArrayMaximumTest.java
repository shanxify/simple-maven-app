
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumTest {

    ArrayMaximum obj = new ArrayMaximum();

    @Test
    void testPositiveNumbers() {
        assertEquals(48, obj.findMaximum(new int[]{10, 25, 7, 48, 32}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-1, obj.findMaximum(new int[]{-5, -1, -9}));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, obj.findMaximum(new int[]{7}));
    }

    @Test
    void testDuplicateMaximum() {
        assertEquals(9, obj.findMaximum(new int[]{9, 3, 9, 2}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(
            IllegalArgumentException.class,
            () -> obj.findMaximum(new int[]{})
        );
    }
}
