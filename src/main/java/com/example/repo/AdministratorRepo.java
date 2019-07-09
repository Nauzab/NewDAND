package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Administrator;

public interface AdministratorRepo extends CrudRepository<Administrator, Integer> {

	
	Administrator findAdministratorByEmailAndPassword(String email, String password);
	Administrator findAdministratorByEmail(String email);
	Administrator findAdministratorByPassword(String password);
}
