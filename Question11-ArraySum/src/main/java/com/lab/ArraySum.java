
package com.lab;

public class ArraySum {

    public int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        ArraySum obj = new ArraySum();

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Sum: " + obj.calculateSum(numbers));
    }
}
