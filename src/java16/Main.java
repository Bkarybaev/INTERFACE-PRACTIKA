package java16;

import java16.dao.impl.GroupDaoImpl;
import java16.mosels.Group;
import java16.mosels.Student;
import java16.service.impl.GroupServiceImpl;
import java16.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GroupDaoImpl groupDao = new GroupDaoImpl();

        GroupServiceImpl groupService = new GroupServiceImpl(groupDao);

        StudentServiceImpl studentService = new StudentServiceImpl(groupDao);

        groupService.addGroup(new Group(1L,"java16"));
        groupService.addGroup(new Group(2L,"java15"));

        //               get all group
//        System.out.println(Arrays.toString(groupService.getAllGroup()));


        studentService.addByGroupName("java16", new Student(1L,"Baiel","Karybaev", LocalDate.of(2004,12,19),"M",501880409));
        studentService.addByGroupName("java16", new Student(2L,"Aibek","Karybaev", LocalDate.of(2004,12,19),"M",501880409));
        studentService.addByGroupName("java15", new Student(3L,"Kanbolot","Karybaev", LocalDate.of(2004,12,19),"M",501880409));
        studentService.addByGroupName("java15", new Student(4L,"Kanchoro","Karybaev", LocalDate.of(2004,12,19),"M",501880409));

        //               get all groups
//        System.out.println(Arrays.toString(groupService.getAllGroup()));

        //               get all students
//        System.out.println(Arrays.toString(studentService.getAllStudent()));

//                       delete group by id
//        groupService.deletedGroupId(1L);
//        groupService.deletedGroupId(2L);
//        System.out.println(Arrays.toString(groupService.getAllGroup()));

        //               get find by id group
//        System.out.println(groupService.findById(1L));

        //               get find by id Student
//        System.out.println(studentService.findByIdStudent(1L));

        //               find by group Name
//        groupService.findByGroupName("java15");

        //               find by first Name
//        studentService.findByStudentName("Aibek");


    }
}