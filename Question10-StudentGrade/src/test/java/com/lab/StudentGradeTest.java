
package com.lab;

import org.junit.jupiter.api.Test;
import com.lab.StudentGrade;


import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    @Test
    void assignsGradeA() {
        assertEquals("A",
                new StudentGrade().calculateGrade(95));
    }

    @Test
    void assignsGradeB() {
        assertEquals("B",
                new StudentGrade().calculateGrade(85));
    }

    @Test
    void assignsFailGrade() {
        assertEquals("F",
                new StudentGrade().calculateGrade(40));
    }

    @Test
    void rejectsMarksAbove100() {
        assertThrows(IllegalArgumentException.class,
                () -> new StudentGrade().calculateGrade(101));
    }

    @Test
    void rejectsNegativeMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> new StudentGrade().calculateGrade(-5));
    }

    @Test
    void acceptsZeroMarks() {
        assertEquals("F",
                new StudentGrade().calculateGrade(0));
    }
    
@Test
void temporaryFailureDemo() {
    assertEquals("A",
            new StudentGrade().calculateGrade(40));
}

}
