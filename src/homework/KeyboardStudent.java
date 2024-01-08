package homework;

import java.util.Scanner;

public class KeyboardStudent {
    public static Student keyboardStudent(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the student name: ");
        student.setName(sc.nextLine());
        System.out.println("Input the student LastName: ");
        student.setLastName(sc.nextLine());
        System.out.println("Choose a gender of student male/female");
        student.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
        System.out.println("Input the student ID: ");
        student.setId(sc.nextInt());
        return student;
    }
}
