package java16.mosels;

import java.util.Arrays;

public class Group {
    private Long id;
    private String groupName;
    private Student[] students = new Student[0];

    public Group() {
    }

    public Group(Long id, String groupName) {
        this.id = id;
        this.groupName = groupName;

    }
    public Group(Student[] students){
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student students1){
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = students1;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
