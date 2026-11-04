package com.bharath.service;

import com.bharath.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    void setUp() {
        service = new StudentService();
    }

    @Test
    void testAddAndFindStudent() {
        Student student = new Student("24Z101", "Bharath Kumar", "CSE", 95.0);
        service.addStudent(student);

        assertTrue(service.findById("24Z101").isPresent());
        assertEquals("Bharath Kumar", service.findById("24Z101").get().getName());
    }

    @Test
    void testCalculateGrade() {
        assertEquals("A+", service.calculateGrade(95.0));
        assertEquals("A", service.calculateGrade(85.0));
        assertEquals("B", service.calculateGrade(75.0));
        assertEquals("C", service.calculateGrade(65.0));
        assertEquals("D", service.calculateGrade(55.0));
        assertEquals("F", service.calculateGrade(40.0));
    }

    @Test
    void testInvalidMarksThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> service.calculateGrade(-5));
        assertThrows(IllegalArgumentException.class, () -> service.calculateGrade(105));
    }

    @Test
    void testScholarshipEligibility() {
        assertTrue(service.isEligibleForScholarship(92.0));
        assertTrue(service.isEligibleForScholarship(85.0));
        assertFalse(service.isEligibleForScholarship(84.9));
    }

    @Test
    void testCalculateAverage() {
        service.addStudent(new Student("1", "Alice", "CSE", 80.0));
        service.addStudent(new Student("2", "Bob", "CSE", 90.0));
        assertEquals(85.0, service.calculateAverageMarks(), 0.001);
    }
}
