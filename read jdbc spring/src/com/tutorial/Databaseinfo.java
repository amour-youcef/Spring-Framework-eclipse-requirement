package com.tutorial;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

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
	
	public List <Person> viewAll(){
		String readData = "select * from person";  

		return jdbcTemplate.query(readData, new RowMapper<Person>() {

			@Override
			public Person mapRow(ResultSet rs, int rownum) throws SQLException {
				// TODO Auto-generated method stub
				Person p = new Person();
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setAge(rs.getInt(4));
				p.setAddress(rs.getString(5));
				p.setPhone(rs.getInt(6));
				return p;
			}
		});
	}

}
