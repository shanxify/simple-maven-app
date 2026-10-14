
package com.lab;

public class PrimeNumber {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();

        System.out.println("7 is prime: " + obj.isPrime(7));
        System.out.println("10 is prime: " + obj.isPrime(10));
    }
}
