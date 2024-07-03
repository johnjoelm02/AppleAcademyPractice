package com.appleacademy.SpringAPI.api.controller;


import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appleacademy.SpringAPI.api.model.User;
import com.appleacademy.SpringAPI.service.UserService;

@RestController
public class UserController {
	
	
	private UserService userService;
	
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam Integer id) {
		java.util.Optional<User> user = userService.getUser(id);
		if(user.isPresent()) {
			return (User) user.get();
		}
		return null;
	}

}
