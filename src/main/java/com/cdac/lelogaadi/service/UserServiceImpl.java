package com.cdac.lelogaadi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.lelogaadi.model.User;
import com.cdac.lelogaadi.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserRepository userRepo;
	
	
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}


	@Override
	public boolean checkEmail(String email) {
		
		return userRepo.existsByEmail(email);
	}

}
