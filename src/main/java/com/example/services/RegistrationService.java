package com.example.services;

import java.util.ArrayList;

import com.example.model.Group;
import com.example.model.Registration;

public interface RegistrationService {
	
		ArrayList<Registration> selectAll();
		boolean insertNewRegistration(Registration reg);
		boolean updateRegistration(Registration reg, int id_reg);
		boolean deleteRegistration(Registration reg);
		ArrayList<Group> findByRunnerid(int id_r);
}
