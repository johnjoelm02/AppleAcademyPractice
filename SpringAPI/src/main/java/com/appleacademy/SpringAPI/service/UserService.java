package com.appleacademy.SpringAPI.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.appleacademy.SpringAPI.api.model.User;

@Service
public class UserService {
	
	private List<User> userList;
	
	public UserService() {
		userList = new ArrayList<>();
		
		User user1 = new User( 1, "John", 24, "john.joelm@gmail.com" );
		User user2 = new User( 2, "Thor", 42, "thor.ragnorak@gmail.com" );
		User user3 = new User( 3, "wakanda", 110, "wakanda.vibranium@gmail.com" );
		User user4 = new User( 4, "tony", 57, "tony.starks@gmail.com" );
		User user5 = new User( 5, "black", 36, "black.widow@gmail.com" );
		
		userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
		
	}
		
	public Optional<User> getUser(Integer id) {
		Optional<User> optional = Optional.empty(); 
		for(User user: userList) {
			if(id == user.getId()) {
				optional = Optional.of(user);
				return optional;
			}
			
		}	
		return optional;

	}
				
}
