package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.model.Person;

public interface PersonDAO {
	Person getPersonById(int i);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}
