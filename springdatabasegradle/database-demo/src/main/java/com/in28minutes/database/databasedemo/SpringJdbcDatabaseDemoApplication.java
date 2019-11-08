package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entitiy.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

// @SpringBootApplication
public class SpringJdbcDatabaseDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
    private PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All person data ->{}", dao.findAll());
//		logger.info("Person id 10001 data ->{}", dao.findById(10001));
//		logger.info("Person name A data ->{}", dao.findByName("A"));
//		logger.info("Person location Dinajpur data ->{}", dao.findByLocation("Dinajpur"));
//		logger.info("Deleted id 10001 ->number of rows affected {}", dao.deleteById(10001));
//		logger.info("Deleted id 10001 or name ->number of rows affected {}", dao.deleteByIdOrName(101, "B"));
//		logger.info("insert id 10006 ->number of rows affected {}", dao.insert(new Person(10006, "X", "USA", new Date())));
		
//		logger.info("Update id 10003 ->number of rows affected {}", dao.update(new Person(10003, "X", "UK", new Date())));
		
		
	}

}
