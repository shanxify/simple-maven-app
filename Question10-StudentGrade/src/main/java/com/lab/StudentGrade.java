
package com.lab;

public class StudentGrade {

    public String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                "Marks must be between 0 and 100"
            );
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        StudentGrade obj = new StudentGrade();
        int marks = 85;

        System.out.println("Student Marks: " + marks);
        System.out.println("Student Grade: " + obj.calculateGrade(marks));
    }
}
