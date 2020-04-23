package com.spring.test;

public class Addresses {

	private String phone;
	private String email;
	private String country;
	private String city;
	private String streetNo;

	

	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getStreetNo() {
		return streetNo;
	}



	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}



	public String infoAddress() {
		return "phon: "+ phone + "email: "+ email +  "country : " +"country"+ country +"city"+ 
	           city +"String"+ streetNo;
	}
}
