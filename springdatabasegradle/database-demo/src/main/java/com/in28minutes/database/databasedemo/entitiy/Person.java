package com.in28minutes.database.databasedemo.entitiy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@NamedQuery(name="find_all_persons", query = "select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	@Column(name="birthDate")
	private Date birthDate;
	
	public Person() {
	
	}
	
	public Person(String name, String location, Date birthDate) {
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person(int id, String name, String location, Date birthDate) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
	
		

}
