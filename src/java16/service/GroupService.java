package java16.service;

import java16.mosels.Group;
import java16.mosels.Student;

public interface GroupService {

    void addGroup(Group newGroup);

    Group[] getAllGroup();

     void deletedGroupId(Long groupId);

     Group findById(Long groupId);

     void findByGroupName(String groupName);



}
