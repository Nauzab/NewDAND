package com.example.demo.services;


import java.util.ArrayList;

import com.example.demo.model.Manager;

public interface ManagerService {
	ArrayList<Manager> selectAll();
	boolean updateManager(Manager manager);
	boolean deleteRunnerById(int id);
	boolean authorizeManager(String email, String password);
	//boolean createNewMarathon(Marathon marathon);
	boolean insertNewManager(Manager manager);
}
