package com.example.services;

import java.util.ArrayList;

import com.example.model.Group;

public interface GroupService {
		
	ArrayList<Group> selectAll();
	boolean insertNewGroup(Group group);
	Group selectById(int id);
	boolean updateGroupById(Group group, int id);
	boolean deleteGroupById(int id);
	
}
