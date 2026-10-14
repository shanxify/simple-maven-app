
package com.lab;

public class Factorial {

    public long findFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Number cannot be negative");
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        System.out.println("Factorial of 5: "
                + obj.findFactorial(5));

        System.out.println("Factorial of 0: "
                + obj.findFactorial(0));
    }
}
