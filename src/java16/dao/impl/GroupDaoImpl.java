package java16.dao.impl;

import java16.dao.GroupDao;
import java16.mosels.Group;
import java16.mosels.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GroupDaoImpl implements GroupDao {

    Group[] groups = new Group[0];
    Group g = new Group();

    @Override
    public void addGroup(Group newGroup) {
        groups = Arrays.copyOf(groups, groups.length + 1);
        groups[groups.length - 1] = newGroup;
    }

    @Override
    public Group[] getAllGroup() {
        return groups;
    }

    @Override
    public void addByGroupName(String groupName, Student newStudent) {
        boolean isblok = false;
        for (Group group : groups) {
            if (group.getGroupName().equals(groupName)) {
                isblok = true;
                group.addStudent(newStudent);
                g.addStudent(newStudent);
            }
        }
        if (!isblok) {
            System.out.println("not faunt " + groupName);
        }
    }

    @Override
    public Student[] getAllStudent() {
      return g.getStudents();
    }

    @Override
    public void deletedGroupId(Long groupId) {
        boolean isblok = false;
        for (int i =0; i< groups.length;i++) {
            if (groups[i].getId().equals(groupId)){
                isblok = true;
                for (int i1 = i; i1 < groups.length-1; i1++) {
                    groups[i1] = groups[i1+1];
                }
            }
        }
        groups = Arrays.copyOf(groups,groups.length-1);

        if (!isblok) System.out.println("not fount :"+groupId+" id !!");
    }

    @Override
    public Group findById(Long groupId) {
        for (Group group : groups) {
            if (group.getId().equals(groupId)){
                return group;
            }
        }
        return null;
    }

    @Override
    public Student findByIdStudent(Long StudentId) {
        for (Student student : g.getStudents()) {
            if (student.getId().equals(StudentId)){
                return student;
            }
        }

        return null;
    }

    @Override
    public void findByGroupName(String groupName) {
        for (Group group : groups) {
            if (group.getGroupName().equalsIgnoreCase(groupName)){
                System.out.println(group);
            }
        }
    }

    @Override
    public void findByStudentName(String firstName) {
        for (Student student : g.getStudents()) {
            if (student.getFirstName().equalsIgnoreCase(firstName)){
                System.out.println(student);
            }
        }
    }
}
