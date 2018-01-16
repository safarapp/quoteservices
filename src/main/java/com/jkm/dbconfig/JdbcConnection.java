package com.jkm.dbconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcConnection {

	 @Autowired
	    public JdbcTemplate jdbcTemplate;
	 
	    public JdbcTemplate getJdbcTemplate() {
	        return jdbcTemplate;
	    }
}
