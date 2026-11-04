package com.bharath.app;

import com.bharath.model.Student;
import com.bharath.service.StudentService;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   Jenkins CD Demo Application - Bharath Kumar   ");
        System.out.println("==================================================");

        StudentService service = new StudentService();
        service.addStudent(new Student("24Z101", "Bharath Kumar", "CSE", 94.5));
        service.addStudent(new Student("24Z102", "Alex", "CSE", 82.0));
        service.addStudent(new Student("24Z103", "Kavya", "CSE", 88.5));

        System.out.println("Enrolled Students:");
        for (Student s : service.getAllStudents()) {
            System.out.println(" - " + s.getName() + " (" + s.getId() + "): Marks = " 
                + s.getMarks() + ", Grade = " + service.calculateGrade(s.getMarks())
                + ", Scholarship = " + (service.isEligibleForScholarship(s.getMarks()) ? "Yes" : "No"));
        }

        System.out.println("Class Average: " + service.calculateAverageMarks());
        System.out.println("CI/CD Pipeline Build & Execution Verified Successfully!");
    }
}
