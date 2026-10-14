
package com.lab;

public class ReverseNumber {

    public int reverse(int number) {
        int reversed = 0;
        int remaining = Math.abs(number);

        while (remaining > 0) {
            int digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining = remaining / 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();

        System.out.println("Original Number: 12345");
        System.out.println("Reversed Number: " + obj.reverse(12345));
    }
}
