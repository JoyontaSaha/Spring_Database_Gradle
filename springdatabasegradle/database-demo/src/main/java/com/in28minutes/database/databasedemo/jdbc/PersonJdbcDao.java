package com.in28minutes.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entitiy.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			
			person.setId(rs.getInt("id"));
			person.setName(rs.getNString("name"));
			person.setLocation(rs.getNString("location"));
			person.setBirthDate(rs.getDate("birthDate"));
			
			return person;
		}
		
	}
	
//	public List<Person> findAll() {
//		return jdbcTemplate.query("Select * from person", new BeanPropertyRowMapper(Person.class));
//	}
	
	public List<Person> findAll() {
	return jdbcTemplate.query("Select * from person", new PersonRowMapper());
}
	
	public Person findByName(String name) {
		return (Person) jdbcTemplate.queryForObject("Select * from person where name = ?", new Object[] {name}
		, new BeanPropertyRowMapper(Person.class));
	}
	
	public Person findById(int id) {
		return (Person) jdbcTemplate.queryForObject("Select * from person where id = ?", new Object[] {id}
		, new BeanPropertyRowMapper(Person.class));
	}
	public Person findByLocation(String location) {
		return (Person) jdbcTemplate.queryForObject("Select * from person where location = ?", new Object[] {location}
		, new BeanPropertyRowMapper(Person.class));
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update("Delete from person where id = ?", new Object[] {id});
	}
	
	public int deleteByIdOrName(int id, String name) {
		return jdbcTemplate.update("Delete from person where id = ? or name = ?", new Object[] {id, name});
	}
	
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person(id, name, location, birthDate) values( ?, ?,  ?,  ?)", person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
	}
	
//	public int insert(Person person) {
//		return jdbcTemplate.update("insert into person (id, name, location, birthDate) " + "values(?,  ?, ?, ?)",
//				new Object[] { person.getId(), person.getName(), person.getLocation(),
//						new Timestamp(person.getBirthDate().getTime()) });
//	}
	
	public int update(Person person) {
		return jdbcTemplate.update("update person set name = ?, location = ?, birthDate = ? where id = ?",  person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId());
	}
	
	
	

//	public int update(Person person, int id) {
//		return jdbcTemplate.update("update person " + " set name = ?, location = ?, birthDate = ? " + " where id = ?",
//				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
//						id });
	}

