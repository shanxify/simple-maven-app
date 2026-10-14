
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest {

    VowelCount obj = new VowelCount();

    @Test
    void testNormalString() {
        assertEquals(3, obj.countVowels("Hello World"));
    }

    @Test
    void testUppercaseVowels() {
        assertEquals(5, obj.countVowels("AEIOU"));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, obj.countVowels("rhythm"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, obj.countVowels(""));
    }

    @Test
    void testNullString() {
        assertThrows(
            IllegalArgumentException.class,
            () -> obj.countVowels(null)
        );
    }
}
