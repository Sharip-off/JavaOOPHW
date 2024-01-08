package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static homework.KeyboardStudent.keyboardStudent;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Nastia", "Pravda", Gender.FEMALE, 0, "");
//        Student student2 = new Student("Valerii", "Sharipov", Gender.MALE, 1, "");
//        Student student3 = new Student("Ura", "Gerasimovich", Gender.MALE, 2, "");
//        Student student4 = new Student("Valentina", "Sherban", Gender.FEMALE, 3, "");
//        Student student5 = new Student("Nazar", "Sherban", Gender.MALE, 4, "");
//        Student student6 = new Student("Tania", "Gerasimovich", Gender.FEMALE, 5, "");
//
//
//        Group family = new Group();
//        family.setGroupName("Family");
//
//        try {
//            family.addStudent(student1);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        try {
//            family.addStudent(student2);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        try {
//            family.addStudent(student3);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        try {
//            family.addStudent(student4);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        try {
//            family.addStudent(student5);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        try {
//            family.addStudent(student6);
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(family);

//        family.sortStudentByLastName();
//        System.out.println(family);
//
//        Student student7 = new Student();
//        try {
//            family.addStudent(keyboardStudent(new Student()));
//        } catch (GroupOverflowException e) {
//            e.printStackTrace();
//        }
//        family.sortStudentByLastName();
//        System.out.println(family);
//
//        String studentInfo = new CSVStringConverter().toStringRepresentation(student1);
//        System.out.println(studentInfo);
//
//        String stInfo = "Ivan,Ivanov";
//        Student student21 = new CSVStringConverter().fromStringRepresentation(stInfo);
//        System.out.println(student21);
//
//        File st = new File("Petrov.csv");
//        String str=CSVStringConverter.getStringFromCSV(st);
//        Student st12 = new CSVStringConverter().fromStringRepresentation(CSVStringConverter.getStringFromCSV(st));
//        System.out.println(st12);
//        new GroupFileStorage().saveGroupToCSV(family);
//        File group = new File("Family.csv");
//        Group grInfo = new Group();
//        try {
//            grInfo = new GroupFileStorage().loadGroupFromCSV(group);
//        } catch (IOException | GroupOverflowException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(grInfo);
        File someFolder = new File(".");
        try {
            new GroupFileStorage().findFileByGroupName("Family.csv", someFolder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
