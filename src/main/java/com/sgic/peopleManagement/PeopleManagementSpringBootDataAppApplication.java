package com.sgic.peopleManagement;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.sgic.peopleManagement.entities.Person;
import com.sgic.peopleManagement.services.PersonService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Person> list = personService.findByLastName("Arikari", 
				new PageRequest(1,4, Direction.ASC, "firstName"));
		
		list.forEach(System.out::println);
	}

}
