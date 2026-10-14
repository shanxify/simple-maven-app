
package com.lab;

public class LargestNumber {

    public int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();

        System.out.println("Largest of 10, 25, 15: "
                + obj.findLargest(10, 25, 15));

        System.out.println("Largest of 40, 20, 30: "
                + obj.findLargest(40, 20, 30));
    }
}
