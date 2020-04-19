package com.spring.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Person {

	private int id;
	private String personName;
	private Map<String,String> address;

	public Person() {
		super();
	}

	public Person(int id, String personName, Map<String,String> address) {
		super();
		this.id = id;
		this.personName = personName;
		this.address = address;
	}

	void display() {
		System.out.println("id : " + id + " : " + personName);
		
		Set<Entry<String,String>> set = address.entrySet();
		
		Iterator<Entry<String,String>>  it = set.iterator();
		while (it.hasNext()) {
			Entry<String,String> entry = it.next();
			System.out.println("Address: " + entry.getKey()+ "Address: " + entry.getValue());
		}
	}
}
