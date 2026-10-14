
package com.lab;

public class VowelCount {

    public int countVowels(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        VowelCount obj = new VowelCount();
        String text = "Hello World";

        System.out.println("Text: " + text);
        System.out.println("Number of Vowels: " + obj.countVowels(text));
    }
}
