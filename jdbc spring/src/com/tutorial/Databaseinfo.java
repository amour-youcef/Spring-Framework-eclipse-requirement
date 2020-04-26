package com.tutorial;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Databaseinfo {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	 
     
  

	public int insertPerson(Person p) {
		String insertData = "INSERT INTO `person`(`fname`, `lname`, `age`, `address`, `phone`) VALUES ('" + 
	                                                     p.getFname()   + "','" +
	                                                     p.getLname()   + "','" +
	                                                     p.getAge()     + "','" +
	                                                     p.getAddress() + "','" +
	                                                     p.getPhone()   + "')";
		
		return jdbcTemplate.update(insertData);
	}
	
	public int updatePerson(Person p) {
		String updateData = "update  person set id='" + p.getId()
				                           +"',fname='" + p.getFname()
				                           +"',lname='" + p.getLname()   
				                           +"',age='"   + p.getAge()     
				                           +"',address='" + p.getAddress() 
				                           +"',phone='" + p.getPhone() +"' where id="+p.getId();
		                                                                
		return jdbcTemplate.update(updateData);
	}
	
	public int deletePerson(Person p) {
		
		String deleteData = "delete from person where id='"+p.getId()+"' ";
		return jdbcTemplate.update(deleteData);
	}
	
	
}
