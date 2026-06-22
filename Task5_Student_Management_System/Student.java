package Task5_Student_Management_System;

public class Student {

    private int studentId;
    private String studentName;
    private double marks;

    public Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }
}