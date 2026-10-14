package com.lab;

public class EvenOdd {

    public String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        System.out.println("10 is " + obj.checkNumber(10));
        System.out.println("7 is " + obj.checkNumber(7));
    }
}