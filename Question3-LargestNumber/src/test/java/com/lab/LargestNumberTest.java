
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberTest {

    @Test
    void testLargestFirstNumber() {
        LargestNumber obj = new LargestNumber();
        assertEquals(30, obj.findLargest(30, 20, 10));
    }

    @Test
    void testLargestSecondNumber() {
        LargestNumber obj = new LargestNumber();
        assertEquals(50, obj.findLargest(10, 50, 30));
    }

    @Test
    void testLargestThirdNumber() {
        LargestNumber obj = new LargestNumber();
        assertEquals(90, obj.findLargest(20, 30, 90));
    }

    @Test
    void testEqualNumbers() {
        LargestNumber obj = new LargestNumber();
        assertEquals(10, obj.findLargest(10, 10, 10));
    }
}
