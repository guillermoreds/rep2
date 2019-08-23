package com.javasampleapproach.springsecurity.jdbcauthentication.controller2;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springsecurity.jdbcauthentication.repository.UserRepository;
 


@RestController
@RequestMapping(path="/user")


public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public String check() {
		return "hola G";
	}
	
	public List<String> getAllUserNames(){
		return userRepository.getAllUserNames();
	}

}
