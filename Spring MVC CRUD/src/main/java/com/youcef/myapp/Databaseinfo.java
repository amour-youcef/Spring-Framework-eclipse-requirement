package com.youcef.myapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
	
	
	public int updatePerson(Person p) {
			// TODO Auto-generated method stub
		String updateData="update person set" +
				"fname="+"'"+p.getFname()+"'"+","+
				"lname="+"'"+p.getLname()+"'"+","+
				"age="+"'"+p.getAge()+"'"+","+
				"height="+"'"+p.getHeight()+"'"+","+
				"waight="+"'"+p.getWeight()+"'"+","+
				"gender="+"'"+p.getGender()+"'"+","+
				"email="+"'"+p.getEmail()+"'"+","+
				"city="+"'"+p.getCity()+"'"+","+
				"country="+"'"+p.getCountry()+"')";
	
	return template.update(updateData);
}

//public int deleteEmployee(Person e) {
//	String query = "delete from employee where id='" + e.getId() + "' ";
//	return jdbcTemplate.update(query);
//}
	
	
	public List <Person> viewAll(){
		String readData = "select * from person2";  

		return template.query(readData, new RowMapper<Person>() {

			@Override
			public Person mapRow(ResultSet rs, int rownum) throws SQLException {
				// TODO Auto-generated method stub
				Person p = new Person();
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setAge(rs.getInt(4));
			    p.setHeight(rs.getFloat(5));
			    p.setGender(rs.getString(6));
			    p.setPhone(rs.getInt(7));
			    p.setEmail(rs.getString(8));
			    p.setCity(rs.getString(9));
			    p.setCountry(rs.getString(10));
				return p;
			}
		});
	}

	public Person personById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
