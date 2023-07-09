package com.cdac.lelogaadi.service;

import org.springframework.stereotype.Service;

import com.cdac.lelogaadi.model.User;


public interface UserService {

	 public User createUser(User user);
	 
	 public boolean checkEmail(String email);
}
