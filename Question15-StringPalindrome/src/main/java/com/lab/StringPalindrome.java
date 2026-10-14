
package com.lab;

public class StringPalindrome {

    public boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        String normalized = text
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        String reversed = new StringBuilder(normalized)
                .reverse()
                .toString();

        return normalized.equals(reversed);
    }

    public static void main(String[] args) {
        StringPalindrome checker = new StringPalindrome();
        String text = "Madam";

        System.out.println("Original String: " + text);
        System.out.println("Is Palindrome: " + checker.isPalindrome(text));
    }
}
