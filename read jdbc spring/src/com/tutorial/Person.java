package com.tutorial;

public class Person {
  
	private int id;
	private String fname;
	private String lname;
	private int age ;
	private String address;
	private int phone;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String fname, String lname, int age, String address, int phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public Person(String fname, String lname, int age, String address, int phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String display() {
		return id +""+fname+""+lname+""+age+""+address+""+phone;
	}
}
