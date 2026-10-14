
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString obj = new ReverseString();

    @Test
    void testNormalString() {
        assertEquals("olleH", obj.reverse("Hello"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", obj.reverse("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", obj.reverse(""));
    }

    @Test
    void testStringWithSpaces() {
        assertEquals("dlroW olleH", obj.reverse("Hello World"));
    }

    @Test
    void testNullString() {
        assertThrows(
            IllegalArgumentException.class,
            () -> obj.reverse(null)
        );
    }
}
