package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.dao.UserDao;
import com.wipro.model.Login;
import com.wipro.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;
	
	public int register(User user) {
		return userDao.register(user);
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}
}