package com.sgic.peopleManagement.repositories;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	List<Person> findByLastName(String lastName, Pageable pageable);

	
}
