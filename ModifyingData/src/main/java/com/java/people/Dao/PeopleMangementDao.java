package com.java.people.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;

//import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.java.people.entity.Person;

public interface PeopleMangementDao extends CrudRepository<Person, Integer> {


	@Transactional
	@Modifying
	@Query(value="update Person set email=:newEmail where id=:id")
	void UpdatePersonByEmailId( @Param("id")Integer id,@Param("newEmail") String newEmail);
}
