package studentApp;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("How many students you want to add");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println();
    }
}
