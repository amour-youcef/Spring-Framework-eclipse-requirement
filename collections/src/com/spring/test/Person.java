package com.spring.test;

import java.util.Iterator;
import java.util.List;

public class Person {

	private int id;
	private String personName;
	private List<String> address;

	public Person() {
		super();
	}

	public Person(int id, String personName, List<String> address) {
		super();
		this.id = id;
		this.personName = personName;
		this.address = address;
	}

	void display() {
		System.out.println("id : " + id + " : " + personName);
		Iterator<String> it = address.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
