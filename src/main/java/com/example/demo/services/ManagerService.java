package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.model.Manager;

public interface ManagerService {
	ArrayList<Manager> selectAll();
	Manager selectById(int id_m);
	boolean updateManagerById();
	boolean deleteRunnerById(int id);
	Manager findByNameAndSurname(String name, String surname);
	boolean authorizeManager(String email, String password);
	boolean createNewMarathon(Marathon marathon);

}
