package com.youcef.myapp;

import org.springframework.jdbc.core.JdbcTemplate;

public class Databaseinfo {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertPerson(Person p) {
		String insertData = "insert into person2 ('fname','lname','age','height','weight','gender','email','country') valus ('"+
		"'"+p.getFname()+"'"+","+
		"'"+p.getLname()+"'"+","+
		"'"+p.getAge()+"'"+","+
		"'"+p.getHeight()+"'"+","+
		"'"+p.getWeight()+"'"+","+
		"'"+p.getGender()+"'"+","+
		"'"+p.getEmail()+"'"+","+
		"'"+p.getCity()+"'"+","+
		"'"+p.getCountry()+"')";
		return template.update(insertData);
	}
	
//	public int updatePerson(Person e) {
//	String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
//			+ e.getId() + "' ";
//	return jdbcTemplate.update(query);
//}

//public int deleteEmployee(Person e) {
//	String query = "delete from employee where id='" + e.getId() + "' ";
//	return jdbcTemplate.update(query);
//}
}
