package com.journaldev;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.model.Person;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.dao.PersonDAO;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);
		final Logger logger1 = Logger.getLogger(Main.class);
   logger1.info("List of person is:");
		for (Person p : personDAO.getAllPersons()) {
			logger1.info(p);
	
		}
		logger1.info("\nGet person with ID 3");
		Person personById = personDAO.getPersonById(3);
		logger1.info(personById);

logger1.info("\nCreating person: ");
		Person person = new Person(22, 27, "chennappa", "kandi");
		System.out.println(person);
		personDAO.createPerson(person);
		logger1.info("\nList of person is:");
//		System.out.println("\nList of person is:");

		for (Person p : personDAO.getAllPersons()) {
			logger1.info(p);
	
		}

//		logger1.info("\nDeleting person with ID 2");
////		System.out.println("\nDeleting person with ID 2");
//		personDAO.deletePerson(personById);

		
//		logger1.info("\nUpdate person with ID 6");
//		/*System.out.println("\nUpdate person with ID 4");*/
//
//		Person pperson = personDAO.getPersonById(3);
//		pperson.setLastName("CHANGED");
//		personDAO.updatePerson(pperson);
logger1.info("\nList of person is:");
//		System.out.println("\nList of person is:");
		for (Person p : personDAO.getAllPersons()) {
			logger1.info(p);
//			System.out.println(p);
		}

		context.close();
	}
}
