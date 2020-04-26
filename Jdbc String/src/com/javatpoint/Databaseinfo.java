package com.javatpoint;

import org.springframework.jdbc.core.JdbcTemplate;

public class Databaseinfo {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Person e) {
		String query = "insert into `person`(`fname`, `lname`, `age`, `address`, `phone`) VALUES ('" + e.getFname() + "','" + e.getLname() + "','" + e.getAge()
				                                   + "','" + e.getAddress() + "','" + e.getPhone() + "')";
		return jdbcTemplate.update(query);
	}

//	public int updateEmployee(Person e) {
//		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
//				+ e.getId() + "' ";
//		return jdbcTemplate.update(query);
//	}

//	public int deleteEmployee(Person e) {
//		String query = "delete from employee where id='" + e.getId() + "' ";
//		return jdbcTemplate.update(query);
//	}

}