package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manager;
import com.example.demo.repo.ManagerRepo;


@Service
public class ManagerImpl implements ManagerService{
	
	
	@Autowired
	ManagerRepo managerRepo;

	@Override
	public ArrayList<Manager> selectAll() {
		ArrayList<Manager> tempList = new ArrayList<Manager>();
		for(Manager m: managerRepo.findAll()) {
			tempList.add(m);
		}
		return tempList;
	}

	@Override
	public Manager selectById(int id_m) {
		Manager manTemp = managerRepo.findById(id_m).get();
		if(manTemp != null)
			return manTemp;
		return null;
	}

	@Override
	public boolean updateManager() {
		
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRunnerById(int id_r) {
		if(id > -1 && runnerRepo.existsById(id_r)) {
			runnerRepo.deleteById(id_r);
			return true;
		} else
		return false;
	}

	@Override
	public Manager findByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authorizeManager(String email, String password) {
		ArrayList<Manager> arr = new ArrayList<>();
		if (email != null && password != null) {
			for (Manager m: arr) {
				String emailCheck = m.getEmail();
				if (emailCheck.equals(email)) {
					String passCheck = m.getPassword();
					if (passCheck.equals(password)) {
						return true;
					}
					else {
						System.out.println("Wrong password!");
						break;
					}

				}
				else {
					System.out.println("Wrong email!");
					break;
				}
			}
		}
		return false;
	}

	@Override
	public boolean createNewMarathon(Marathon marathon) {
		if(marathon == null && marathonRepo.existsById(marathon.getId()))
			return false;
		else {
			marathonRepo.save(marathon);
			return true;
		}
	}
