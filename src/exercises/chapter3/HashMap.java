package exercises.chapter3;

//Make a program similar to GradebookHashMap that does the following:
//It takes in student names and ID numbers (as integers) instead of names and grades.
//The keys should be the IDs and the values should be the names.
//Modify the roster printing code accordingly.

import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args){
        java.util.HashMap<Integer, String> students = new java.util.HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newStudentId = input.nextInt();
                students.put(newStudentId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
//        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
        }

//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }
}
