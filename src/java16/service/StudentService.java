package java16.service;

import java16.dao.impl.GroupDaoImpl;
import java16.mosels.Student;

public interface StudentService {

     void addByGroupName(String groupName, Student newStudent);

      Student[] getAllStudent();

    Student findByIdStudent(Long StudentId);

    void findByStudentName(String firstName);

}
