package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Grade 1: ");
        double grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        double grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        double grade3 = sc.nextDouble();

        Student student1 = new Student(
                name,
                grade1,
                grade2,
                grade3
        );

        System.out.println("FINAL GRADE: " + student1.getFinalGrade());
        student1.verifyPass();

        sc.close();
    }

}
