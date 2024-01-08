package homework;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static homework.CSVStringConverter.getStringFromCSV;

public class GroupFileStorage {
    public void saveGroupToCSV(Group gr) {
        File groupFile = new File(gr.getGroupName() + ".csv");
        Student[] arrStudents = gr.getStudents();
        String studentInfo = "";
        String del = ",";
        try (PrintWriter pw = new PrintWriter(groupFile)) {
            for (int i = 0; i < arrStudents.length; i++) {
                if (arrStudents[i] != null) {
                    pw.println(arrStudents[i].getName() + del + arrStudents[i].getLastName() + del + arrStudents[i].getGender() + del + arrStudents[i].getId() + del + arrStudents[i].getGroupName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Group loadGroupFromCSV(File file) throws IOException, GroupOverflowException {
        Group gr = new Group();
        gr.setGroupName(file.getName());
        Student[] arrSt = gr.getStudents();
        String temp = getStringFromCSV(file);
        String[] arrStInfo = temp.split(System.lineSeparator());
        for (int i = 0; i < arrStInfo.length; i++) {
            gr.addStudent(new CSVStringConverter().fromStringRepresentation(arrStInfo[i]));
        }
        return gr;
    }

    public File findFileByGroupName(String groupName, File workFolder) throws FileNotFoundException {
        File[] list = workFolder.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (list[i].isFile() && groupName.equals(list[i].getName()))
                return list[i];
        }
        throw new FileNotFoundException("the File is not found");
    }


}




