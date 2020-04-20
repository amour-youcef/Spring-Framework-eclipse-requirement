package com.spring.test;

import java.util.Iterator;
import java.util.List;

public class Person {

	private int id;
	private String personName;
	private Addresses address;

	public Person() {
		super();
	}

	public Person(int id, String personName) {
		super();
		this.id = id;
		this.personName = personName;
	}

	public Person(int id, String personName, Addresses address) {
		super();
		this.id = id;
		this.personName = personName;
		this.address = address;
	}

	void display() {
		System.out.println("id : " + id + " : " + personName);
		System.out.println("address: " + address.infoAdress());
		
	}
}
