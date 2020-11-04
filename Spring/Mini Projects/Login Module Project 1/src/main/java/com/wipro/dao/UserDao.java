package com.wipro.dao;

import com.wipro.model.Login;
import com.wipro.model.User;

public interface UserDao {

	int register(User user);
	
	User validateUser(Login login);
}
