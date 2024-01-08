package homework;

import java.io.*;
import java.util.Scanner;

public class CSVStringConverter implements StringConverter {
    @Override
    public String toStringRepresentation(Student student) {
        String str = "";
        String del = ",";
        str = student.getName() + del + student.getLastName() + del + student.getGender() + del + student.getId() + del + student.getGroupName();
        File studentInfo = new File(student.getLastName() + ".csv");
        try (PrintWriter pw = new PrintWriter(studentInfo)) {
            pw.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public Student fromStringRepresentation(String str) {
        Student result = new Student();
        String del = ",";
        String[] arr = str.split(del);
        String[] temp = new String[5];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        if (temp[0] != null) {
            result.setName(arr[0]);
        } else {
            result.setName(null);
        }
        if (temp[1] != null) {
            result.setLastName(arr[1]);
        } else {
            result.setLastName(null);
        }
        if (temp[2] != null) {
            result.setGender(Gender.valueOf(arr[2]));
        } else {
            result.setGender(null);
        }
        if (temp[3] != null) {
            result.setId(Integer.parseInt(arr[3]));
        } else {
            result.setId(0);
        }
        if (temp[4] != null) {
            result.setGroupName(arr[4]);
        } else {
            result.setGroupName(null);
        }
        return result;
    }

    public static String getStringFromCSV(File file) {
        String result = "";
        try (Reader rd = new FileReader(file)) {
            char[] chars = new char[1000];
            int readChars = 0;
            for (; ; ) {
                readChars = rd.read(chars);
                if (readChars <= 0) {
                    break;
                }
                result+=new String(chars,0,readChars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
