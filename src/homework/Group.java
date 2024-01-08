package homework;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String groupName;
    private final Student[] students;

    public Group() {
        super();
        students = new Student[10];
    }

    public Student[] getStudents() {
        return students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                students[i].setGroupName(groupName);
                return;
            }
        }
        throw new GroupOverflowException("Group overflow");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)){
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("The student not found.");
    }


    public boolean removeStudentById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public void sortStudentByLastName(){
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
    }


    @Override
    public String toString() {
        String groupInfo = "Group " + getGroupName() + System.lineSeparator();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                groupInfo += students[i] + System.lineSeparator();
            }
        }
        return groupInfo;
    }
}