Student Grade Tracker

Internship Task 1

Name: RAUSHAN KUMAR
Internship: CODE ALPHA
Date: 06 July 2026

Task Objective

Develop a Java application to manage student grades. The program should:

Input and store student names and grades.
Calculate the average grade.
Find the highest and lowest grades.
Display a summary report.
Use Arrays or ArrayLists for data storage.

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input student details
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume newline

            students.add(new Student(name, grade));
        }

        // Calculate statistics
        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;

        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest)
                highest = s.grade;

            if (s.grade < lowest)
                lowest = s.grade;
        }

        double average = total / students.size();

        // Display report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");
        System.out.printf("%-20s %-10s\n", "Student Name", "Grade");
        System.out.println("------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-20s %-10.2f\n", s.name, s.grade);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Average Grade : %.2f\n", average);
        System.out.printf("Highest Grade : %.2f\n", highest);
        System.out.printf("Lowest Grade  : %.2f\n", lowest);

        sc.close();
    }
}









SAMPLE OUTPUT:
Enter the number of students: 3

Student 1
Enter Name: Alice
Enter Grade: 85

Student 2
Enter Name: Bob
Enter Grade: 92

Student 3
Enter Name: Charlie
Enter Grade: 78

========== STUDENT GRADE REPORT ==========
Student Name         Grade
------------------------------------------
Alice                85.00
Bob                  92.00
Charlie              78.00
------------------------------------------
Average Grade : 85.00
Highest Grade : 92.00
Lowest Grade  : 78.00
