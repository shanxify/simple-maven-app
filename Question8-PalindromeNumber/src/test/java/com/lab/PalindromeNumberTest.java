
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber obj = new PalindromeNumber();

    @Test
    void testPalindromeNumber() {
        assertTrue(obj.isPalindrome(121));
    }

    @Test
    void testNonPalindromeNumber() {
        assertFalse(obj.isPalindrome(123));
    }

    @Test
    void testSingleDigit() {
        assertTrue(obj.isPalindrome(7));
    }

    @Test
    void testZero() {
        assertTrue(obj.isPalindrome(0));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(obj.isPalindrome(-121));
    }
}
