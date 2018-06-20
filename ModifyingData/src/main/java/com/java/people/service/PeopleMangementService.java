package com.java.people.service;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.people.Dao.PeopleMangementDao;
import com.java.people.entity.Person;

@Service
public class PeopleMangementService {

	@Autowired
	private PeopleMangementDao peopleMangementDao;

	public void UpdatePersonByEmailId(Integer id, String newEmail) {
		
		 peopleMangementDao.UpdatePersonByEmailId(id,newEmail);
		
		
	}

	
	
	

}
