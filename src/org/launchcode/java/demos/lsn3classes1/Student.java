package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        SchoolPractice.Teacher zac = new SchoolPractice.Teacher("Zac", "Man", "Java", 5);
        System.out.println(zac.getSubject());

    }


}