package com.example.services;

import com.example.model.Administrator;

public interface AdministratorService {

	
	boolean authorizeAdmin(String email, String password);
}
