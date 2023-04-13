package com.save.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.save.operation.model.User;
import com.save.operation.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
    @PostMapping("/save")
	public ResponseEntity<User> savedetails(@RequestBody User user) {
		 User u=userService.savedata(user);
		 System.out.println("conflict kiran_4 ");
		 System.out.println("hye thos is kiran");
		 return ResponseEntity.ok().body(u);
		
	}

}
