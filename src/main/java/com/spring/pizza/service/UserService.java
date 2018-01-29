package com.spring.pizza.service;

import com.spring.pizza.model.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
