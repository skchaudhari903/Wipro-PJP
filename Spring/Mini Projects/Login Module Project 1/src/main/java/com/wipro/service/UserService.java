package com.wipro.service;

import com.wipro.model.Login;
import com.wipro.model.User;

public interface UserService {

	int register(User user);
	User validateUser(Login login);
}
