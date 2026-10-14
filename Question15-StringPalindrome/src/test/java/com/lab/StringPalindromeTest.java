
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    private final StringPalindrome checker = new StringPalindrome();

    @Test
    void testPalindrome() {
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    void testCaseInsensitivePalindrome() {
        assertTrue(checker.isPalindrome("Madam"));
    }

    @Test
    void testPalindromePhrase() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testNullString() {
        assertThrows(
            IllegalArgumentException.class,
            () -> checker.isPalindrome(null)
        );
    }
}
