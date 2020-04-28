package com.tutorial;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class Databaseinfo {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean insertPerson(Person p) {
		String insertData = "INSERT INTO `person`(`fname`, `lname`, `age`, `address`, `phone`) VALUES(?,?,?,?,?)";  

		return jdbcTemplate.execute(insertData, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1,p.getFname());
				ps.setString(2,p.getLname());
				ps.setInt(3, p.getAge());
				ps.setString(4,p.getAddress());
				ps.setInt(5, p.getPhone());
				
				return ps.execute();
			}

		});
	}

	public int updatePerson(Person p) {
		String updateData = "update  person set id='" + p.getId() + "',fname='" + p.getFname() + "',lname='"
				+ p.getLname() + "',age='" + p.getAge() + "',address='" + p.getAddress() + "',phone='" + p.getPhone()
				+ "' where id=" + p.getId();

		return jdbcTemplate.update(updateData);
	}

	public int deletePerson(Person p) {

		String deleteData = "delete from person where id='" + p.getId() + "' ";
		return jdbcTemplate.update(deleteData);
	}

}
