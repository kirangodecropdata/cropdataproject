package com.deletedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deletedemo.model.User;
import com.deletedemo.service.UserService;

@RestController
@RequestMapping("/save")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/create")
	public ResponseEntity<User> saveDetails(@RequestBody User user) {
		
		User u=userservice.savedata(user);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}

}
