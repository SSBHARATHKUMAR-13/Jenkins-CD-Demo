package com.bharath.model;

public class Student {
    private String id;
    private String name;
    private String department;
    private double marks;

    public Student(String id, String name, String department, double marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }

    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", marks=" + marks +
                '}';
    }
}
