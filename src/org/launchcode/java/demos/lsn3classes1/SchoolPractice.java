package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {

    public class Java {
        private String encapsulation;
        private ArrayList<Student> enrolledStudents;
        private int studentsInClass;
    }

    public static class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching = 0;

        public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setlastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student sam = new Student("sam", 1108048, 130, 4.0);
        System.out.println(sam.getNumberOfCredits());
        System.out.println(sam.getStudentId());

//        Teacher zac = new Teacher("Zac", "Man", "Java", 5);
//        System.out.println(zac.getSubject());
    }
}
