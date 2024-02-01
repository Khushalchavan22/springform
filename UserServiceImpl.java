package com.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.models.User;
import com.crud.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	


	@Override
	public void registerUser(User user) {
		
		userRepository.save(user);
		
	}

}
