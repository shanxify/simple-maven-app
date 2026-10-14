
package com.lab;

public class ReverseString {

    public String reverse(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String text = "Hello World";

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + obj.reverse(text));
    }
}
