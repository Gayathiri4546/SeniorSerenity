package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	//get all users
	@GetMapping("/users")
	 public List<User> getAllUsers()
	 {
		 return userRepository.findAll();
	 }
	
	//create user rest API
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}

}
