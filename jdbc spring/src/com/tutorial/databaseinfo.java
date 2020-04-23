package com.tutorial;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class databaseinfo {

	private JdbcTemplate template ;
	
	public int insertPerson(Person p) {
		String insertData = "INSERT INTO person ('fname','lname','age','address','phone')VALUES ("
				                                        + p.getFname()  + "," +
				                                         p.getLname()   + "," +
				                                         p.getAge()     + "," +
				                                         p.getAddress() + "," +
				                                         p.getPhone()   + ")";
		
		return template.update(insertData);
	}
	
	public int updatePerson(Person p) {
		String updateData = "UPDATE person SET ('fname','lname','age','address','phone')VALUES ("+
				                                  "'fname'=" + p.getFname()
				                                  +",'lname'=" + p.getLname()   
				                                  +",'age'=" + p.getAge()     
				                                  +",'address'=" + p.getAddress() 
				                                  +",'phone'=" + p.getPhone()   + "WHERE id=" +p.getId()+ ")";
		
		return template.update(updateData);
	}
	
	public int deletePerson(Person p) {
		
		String deleteData = "DELETE FROM 'person' WHERE id="+p.getId()+  ")";
		
		return template.update(deleteData);
	}
	
	
}
