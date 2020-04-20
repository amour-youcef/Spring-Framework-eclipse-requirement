package com.spring.test;

public class Addresses {

	private String phone;
	private String email;
	private String country;
	private String city;
	private String streeNo;

	public Addresses(String phone, String email, String country, String city, String streeNo) {
		super();
		this.phone = phone;
		this.email = email;
		this.country = country;
		this.city = city;
		this.streeNo = streeNo;
	}

	public String infoAdress() {
		return "phone: "+ phone +"email: " + email + "country : " +country + "city: "+ city+ "streeNo"+ streeNo;
	}
}
