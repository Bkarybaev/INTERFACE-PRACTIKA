package java16.service.impl;

import java16.dao.GroupDao;
import java16.mosels.Group;
import java16.mosels.Student;
import java16.service.GroupService;

public class GroupServiceImpl implements GroupService {

    private final GroupDao groupDao;

    public GroupServiceImpl(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public void addGroup(Group newGroup) {
        groupDao.addGroup(newGroup);
    }

    @Override
    public Group[] getAllGroup() {
        return groupDao.getAllGroup();
    }

    @Override
    public void deletedGroupId(Long groupId) {
         groupDao.deletedGroupId(groupId);
    }

    @Override
    public Group findById(Long groupId) {
        return groupDao.findById(groupId);
    }

    @Override
    public void findByGroupName(String groupName) {
        groupDao.findByGroupName(groupName);
    }


}
