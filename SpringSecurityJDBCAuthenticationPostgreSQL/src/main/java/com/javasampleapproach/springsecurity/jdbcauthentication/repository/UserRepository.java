package com.javasampleapproach.springsecurity.jdbcauthentication.repository;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<String> getAllUserNames(){
		List<String> usernameList = new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("select name form user2;", String.class));
		return usernameList;
	}
	
	
	
}
