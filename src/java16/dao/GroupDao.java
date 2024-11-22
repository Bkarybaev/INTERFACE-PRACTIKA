package java16.dao;

import java16.mosels.Group;
import java16.mosels.Student;

public interface GroupDao {

    void addGroup(Group newGroup);

    Group[] getAllGroup();

    void addByGroupName(String groupName, Student newStudent);

    Student[] getAllStudent();

    void deletedGroupId(Long groupId);

    Group findById(Long groupId);

    Student findByIdStudent(Long StudentId);

    void findByGroupName(String groupName);

    void findByStudentName(String firstName);





}
