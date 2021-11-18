package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stundent = new Student();
            stundent.name = sc.nextLine();
        stundent.grade1 = sc.nextDouble();
        stundent.grade2 = sc.nextDouble();
        stundent.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", stundent.finalGrade());
        if (stundent.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stundent.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

            sc.close();
    }
}
