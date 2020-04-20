package com.spring.test;

import java.util.Iterator;
import java.util.List;

public class Person {

	private int id;
	private String personName;
	private String job;

	public Person() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	void display() {
		System.out.println("id : " + id + " : " + personName + "job: "+ job);
		
	}
}
