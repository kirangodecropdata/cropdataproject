package com.save.operation.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.save.operation.model.User;
import com.save.operation.repository.UserRepository;
import com.save.operation.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User savedata(User user) {
		User u=userRepository.save(user);
             return u; 
	}

}
