
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    ArraySum obj = new ArraySum();

    @Test
    void testPositiveNumbers() {
        assertEquals(150, obj.calculateSum(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-6, obj.calculateSum(new int[]{-1, -2, -3}));
    }

    @Test
    void testMixedNumbers() {
        assertEquals(4, obj.calculateSum(new int[]{-2, 3, 5, -2}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, obj.calculateSum(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, obj.calculateSum(new int[]{7}));
    }
}
