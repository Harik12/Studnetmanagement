package com.java.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.people.service.PeopleMangementService;

@SpringBootApplication
public class ModifyingDataApplication implements CommandLineRunner {
	@Autowired
	private  PeopleMangementService peopleMangementService;

	public static void main(String[] args) {
		SpringApplication.run(ModifyingDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UpdatePersonByEmailId();
		
		
	}

	private void UpdatePersonByEmailId() {
		Integer id =3;
		String newEmail="girilkm@gmail.com";
		peopleMangementService.UpdatePersonByEmailId(id,newEmail);
		
	}

	
}
