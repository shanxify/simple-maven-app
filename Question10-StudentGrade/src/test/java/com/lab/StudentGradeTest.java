
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    StudentGrade obj = new StudentGrade();

    @Test
    void testGradeA() {
        assertEquals("A", obj.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", obj.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", obj.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", obj.calculateGrade(65));
    }

    @Test
    void testGradeF() {
        assertEquals("F", obj.calculateGrade(45));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(
            IllegalArgumentException.class,
            () -> obj.calculateGrade(101)
        );
    }
}
