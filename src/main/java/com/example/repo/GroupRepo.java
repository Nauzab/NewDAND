package com.example.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Group;

public interface GroupRepo extends CrudRepository<Group, Integer> {
	ArrayList<Group> SelectAll();
	Group selectById(Integer id);
	Group findByDistance(double distance);
}
