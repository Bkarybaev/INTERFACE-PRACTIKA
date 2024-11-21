package java16.dao.impl;

import java16.dao.GroupDao;
import java16.mosels.Group;
import java16.mosels.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GroupDaoImpl implements GroupDao {

    Group[] groups = new Group[0];

    @Override
    public void addGroup(Group newGroup) {
        groups = Arrays.copyOf(groups,groups.length + 1);
        groups[groups.length -1 ] = newGroup;
    }

    @Override
    public Group[] getAllGroup() {
        return groups;
    }

    @Override
    public void addByGroupName(String groupName, Student newStudent) {
        boolean isblok =false;
        for (Group group : groups) {
            if (group.getGroupName().equals(groupName)){
                isblok = true;
                Student[] students = {newStudent};
                group.setStudents(students);
            }
        }
        if (!isblok){
            System.out.println("not faunt " + groupName);
        }
    }
}
