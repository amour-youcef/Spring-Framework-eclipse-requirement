package com.spring.test;

public class Addresses {

	private String phone;
	private String email;
	private String country;
	private String city;
	private String streetNo;

	public Addresses(String phone, String email, String country, String city, String streetNo) {
		super();
		this.phone = phone;
		this.email = email;
		this.country = country;
		this.city = city;
		this.streetNo = streetNo;
	}

	public String infoAddress() {

		return "phone : "+phone +"Email : "+ email + "country : "+country + " city : "+city + " streeNo : "+streetNo;
	}
}
