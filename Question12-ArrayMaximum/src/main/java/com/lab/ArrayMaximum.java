
package com.lab;

public class ArrayMaximum {

    public int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException(
                "Array cannot be null or empty"
            );
        }

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayMaximum obj = new ArrayMaximum();
        int[] numbers = {10, 25, 7, 48, 32};

        System.out.println("Maximum Element: " + obj.findMaximum(numbers));
    }
}
