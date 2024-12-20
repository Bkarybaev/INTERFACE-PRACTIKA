package java16.service.impl;

import java16.dao.impl.GroupDaoImpl;
import java16.mosels.Student;
import java16.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private final GroupDaoImpl groupDao;



    public StudentServiceImpl(GroupDaoImpl groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public void addByGroupName(String groupName, Student newStudent) {
        groupDao.addByGroupName(groupName, newStudent);
    }

    @Override
    public Student[] getAllStudent() {
        return groupDao.getAllStudent();
    }

    @Override
    public Student findByIdStudent(Long StudentId) {
        return groupDao.findByIdStudent(StudentId);
    }

    @Override
    public void findByStudentName(String firstName) {
        groupDao.findByStudentName(firstName);
    }
}
