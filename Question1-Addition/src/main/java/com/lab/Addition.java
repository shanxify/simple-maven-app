package com.lab;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum = " + obj.add(10, 20));
    }
}