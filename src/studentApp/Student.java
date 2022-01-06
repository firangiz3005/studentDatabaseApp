package studentApp;

import java.util.Scanner;

public class Student {

    // Ask the user how many students will be added to the database
    private String name;
    private String surname;
    private String studentId;
    private int gradeYear;
    private static int id = 1000;
    private String courses = " ";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private int balance = 3000;


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Student's name: ");
        this.name = in.nextLine();

        System.out.print("Student's surname: ");
        this.surname = in.nextLine();

        System.out.print("Student's grade: ");
        this.gradeYear = in.nextInt();

        setStudentId();

    }

    private void setStudentId() {

        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n     " + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {
                break;
            }
        } while (1 != 0) ;
    }
    public void viewBalance() {
        System.out.println("Your balance is: " + "$" + tuitionBalance);


    }
    public void payTuition () {
        System.out.println("Tuition balance: " + tuitionBalance);
        System.out.println("How much you can pay? ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        viewBalance();
        System.out.println();
    }

    public String toString() {
        return "Student's name is: " + name + "\nStudent's ID is: " + studentId +
                "\nStudent's courses are: " + courses + "\nStudent's balance is: " + tuitionBalance;
    }
}

