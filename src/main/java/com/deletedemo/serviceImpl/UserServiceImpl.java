package com.deletedemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deletedemo.model.User;
import com.deletedemo.repository.UserRepository;
import com.deletedemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User savedata(User user) {

		return userRepository.save(user);
	}

}
