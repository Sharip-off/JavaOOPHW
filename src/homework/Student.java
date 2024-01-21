package homework;

import java.util.Objects;

public class Student extends Human{
    private int id;
    private String groupName;

    public Student() {
    }

    public Student(String name, String lastName, Gender gender, int id, String groupName) {
        super(name, lastName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return getId() == student.getId() && Objects.equals(getGroupName(), student.getGroupName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getGroupName());
    }
}
