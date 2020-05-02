package com.youcef.myapp;

import org.springframework.jdbc.core.JdbcTemplate;

public class Databaseinfo {

	private JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}
	
}
